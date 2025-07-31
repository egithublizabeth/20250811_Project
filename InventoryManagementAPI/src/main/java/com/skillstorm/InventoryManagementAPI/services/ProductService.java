package com.skillstorm.InventoryManagementAPI.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.dtos.ProductDTO;
import com.skillstorm.InventoryManagementAPI.models.Product;
import com.skillstorm.InventoryManagementAPI.repositories.ProductRepository;

@Service  //this specifies that this class is a service, typically used for all endpoint logic other than just pointing endpoints to their destinations
          //this class in an injectable Component/Bean
public class ProductService 
{
	//injecting a Repository bean, instantiate the final variable and set up the only constructor
	private final ProductRepository repo;
	
	//constructor injection, only every going to have one of this class, annotation is optional since it's the only constructor
	public ProductService(ProductRepository repo) 
	{
		this.repo = repo;
	}
	
	//find all products with error response
	public ResponseEntity<Iterable<Product>> findAllProduct()
	{
		Iterable<Product> products = this.repo.findAll();
		
		if (!products.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.ok(products);
	}
	
	//find a Product by ID with Error Response
	public ResponseEntity<Product> findByIDProduct(int id)
	{
		Optional<Product> product = this.repo.findById(id);
		
		if (product.isPresent())
			return ResponseEntity.ok(product.get());
		return ResponseEntity.notFound().build();
		
	}
	
	//create one | use ResponseEntity<Product>  if you want to only return the Product with no body information
	public ResponseEntity<String> createOneProduct(ProductDTO dto)
	{
		//variable to hold response body for Http Responseß
		String responseBody = "This record exists already. Can not create new record with given parameters.";
		
		//If ID DNE, create a new record, else return Error Response, we do not want to overwrite existing records
		if (!this.repo.existsById(dto.productId()))
			
			return ResponseEntity.status(HttpStatus.CREATED)
	                             .body(this.repo.save(new Product(dto.productId(), dto.productName(), dto.price())).toString());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
							 .body(responseBody); 
	}
	
	//update one | use ResponseEntity<Product>  if you want to only return the Product with no body information	
	public ResponseEntity<String> updateOneProduct(int id, ProductDTO dto) 
	{
		//if ID exists, update the record else return 404 Error Response
		if (this.repo.existsById(id))
			
			return ResponseEntity.ok(this.repo.save(new Product(id, dto.productName(), dto.price())).toString());
		
		String responseBody = "This record does not exist(DNE). Can not update a record that DNE.";

		return ResponseEntity.status(HttpStatus.NOT_FOUND)
							 .body(responseBody);
	}
	
	//delete one | use ResponseEntity<Void>  if you want to HttpResponse with no body information
//	public ResponseEntity<Void> deletByIdProduct(int id)
//	{
//		this.repo.deleteById(id);
//		
//		return ResponseEntity.noContent().build();
//	}
	
	public ResponseEntity<String> deletByIdProduct(int id)
	{
		//variable to hold the response for the Http response body
		String responseBody;

		if (this.repo.existsById(id))
			{	//find the record to delete to show the user which record was deleted
				Optional<Product> product = this.repo.findById(id);
				responseBody = "Record was deleted.\n\n" + product.get().toString();
			}
		
		else
			responseBody = 	"Record does not exist(DNE).";
		
		//delete the record by id
		this.repo.deleteById(id);
		
		//return ResponseEntity.status(HttpStatus.NO_CONTENT).body(responseBody); //ensures that a no_content can not have a body response
		//return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseBody);  //not correct response but allows body response information
		return ResponseEntity.status(HttpStatus.OK).body(responseBody);  //not correct response but allows body response information

	}
	
}
