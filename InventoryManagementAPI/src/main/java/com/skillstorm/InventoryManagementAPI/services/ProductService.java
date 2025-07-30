package com.skillstorm.InventoryManagementAPI.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

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
	
	//create one
	
	//update one
	
	//delete one
	public ResponseEntity<Void> deletByIdProduct(int id)
	{
		this.repo.deleteById(id);
		
		return ResponseEntity.noContent().build();
	}
	
}
