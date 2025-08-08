package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.InventoryManagementAPI.dtos.ProductDTO;
import com.skillstorm.InventoryManagementAPI.models.Message;
import com.skillstorm.InventoryManagementAPI.models.Product;
import com.skillstorm.InventoryManagementAPI.services.ProductService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;

@RestController 
/* composite annotation of @Controller and @ResponseBody
   @Controller sets this class as a file that parses end points
   any end points listed properly here will be available for users to interact with
   @ResponseBody says that this class DOES NOT return HTML views but HttpResponse information in the body (no webpage, just a json/xml response)
*/

@RequestMapping("/products") //all requests formated like "localhost:8080/products" ... will route to this controller
public class ProductController 
{
	//injecting a Service bean, instantiate the final variable and set up the only constructor
	private final ProductService service;
	
	public ProductController(ProductService service)
	{
		this.service = service;
	}
	
	//find all products with Error Response (Method 1 of 6)
	@GetMapping
	public ResponseEntity<Iterable<Product>> findAllProduct()
	{
		return this.service.findAllProduct();
	}
	
	//find all products with a limit on return records with error response (Method 2 of 6)
	@GetMapping("/limit/{limitValue}")
	public ResponseEntity<Object> findAllProductLimit(@Validated @Positive(message = "Limit Value > 0") @PathVariable int limitValue)
	{
		return this.service.findAllProductLimit(limitValue);
	}
	
	//find a Product by ID with Error Response (Method 3 of 6)
	@GetMapping("/{productId}")
	public ResponseEntity<Product> findByIDProduct(@Validated @PositiveOrZero(message = "Product Id >= 0") @PathVariable("productId") int id)
	{
		return this.service.findByIDProduct(id);
	}
	
	//create one product record and insert into the product table (Method 4 of 6)
	@PostMapping
	public ResponseEntity<Message> createOneProduct(@Valid @RequestBody ProductDTO dto)
	{
		return this.service.createOneProduct(dto);
	}
	
	//update an existing product record (Method 5 of 6)
	@PutMapping("/{id}")
	public ResponseEntity<Message> updateOne(@Valid @PathVariable int id, @RequestBody ProductDTO dto) 
	{
		return this.service.updateOneProduct(id, dto);
	}
	
	//delete a product record (Method 6 of 6)
	@DeleteMapping("/{id}")
	public ResponseEntity<Message> deleteByIdProduct(@PathVariable int id)
	{
		return this.service.deletByIdProduct(id);
	}
	
}
