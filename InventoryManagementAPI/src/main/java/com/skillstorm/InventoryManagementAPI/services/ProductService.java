package com.skillstorm.InventoryManagementAPI.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.dtos.ProductDTO;
import com.skillstorm.InventoryManagementAPI.models.Message;
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
	
	//****create an instance of Message object****
	private Message message;
	
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
	
	//create one Product
	public ResponseEntity<Message> createOneProduct(ProductDTO dto)
	{
		//If ID DNE, create a new record, else return Error Response, we do not want to overwrite existing records
		if (!this.repo.existsById(dto.productId()))
		{
			//create the product object
			Product product = new Product(dto.productId(), dto.productName(), dto.price());
			
			//create/add the product record from the product object
			this.repo.save(product);
			
			//create a message object with responseBody that has a Product object
			message = new Message("validCreate", product);
			
			return ResponseEntity.status(HttpStatus.CREATED)
								 .body(message);
		}
		
		//the record exists already - create a message object with a responseBody that has no Product Object
		message = new Message("invalidCreate");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
							 .body(message); 
	}
	
	//update one Product
	public ResponseEntity<Message> updateOneProduct(int id, ProductDTO dto) 
	{
		//if ID exists, update the record else return 404 Error Response
		if (this.repo.existsById(id))
		{
			Product product = new Product(id, dto.productName(), dto.price());
			
			//update the record
			this.repo.save(product);
						
			//create a message object with responseBody that has a Product object
			message = new Message("validUpdate", product);
			
			return ResponseEntity.ok().body(message);
		}
		
		//id does not exist so you can not update it - create a message object with a responseBody that has no Product Object
		message = new Message("invalidUpdate");
				
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
							 .body(message);
	}
	
	//delete one Product
	public ResponseEntity<Message> deletByIdProduct(int id)
	{
		//if id exists then delete the record, else record DNE
		if (this.repo.existsById(id))
		{	//find the record to delete to show the user which record was deleted
			Optional<Product> product = this.repo.findById(id);
			
			//convert the Optional type to Product type
			Product product1 = product.get();

			//create a message object with responseBody that has a Product object
			message = new Message("validDelete", product1);
			
			//delete the record by id
			this.repo.deleteById(id);
			
			//not correct response but allows body response information
			return ResponseEntity.status(HttpStatus.OK).body(message);  
		}
		
		//record DNE - create a message object with a responseBody that has no Product Object
		message = new Message("invalidDelete");

		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				 			 .body(message);
	
		//return ResponseEntity.status(HttpStatus.NO_CONTENT).body(message); //a no_content can not have a body response
	}
	
}
