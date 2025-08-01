package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.http.ResponseEntity;
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

@RestController //composite annotation of @Controller and @ResponseBody
                // @Controller sets this class as a file that parses endpoints
				// any endpoints listed properly here will be available for users to interact with
				// @ResponseBody says that this class DOES NOT return HTML views but HttpResponse information in the body (no webpage, just a json/xml response)

@RequestMapping("/products") //all requests formated like "localhost:8080/products" ... will route to this controller
public class ProductController 
{
	//injecting a Service bean, instantiate the final variable and set up the only constructor
	private final ProductService service;
	
	public ProductController(ProductService service)
	{
		this.service = service;
	}
	
	//find all Products with Error Response
	@GetMapping
	public ResponseEntity<Iterable<Product>> findAllProduct()
	{
		return this.service.findAllProduct();
	}
	
	//find by Product ID with Error Response
	@GetMapping("/{productId}")
	public ResponseEntity<Product> findByIDProduct(@PathVariable("productId") int id)
	{
		return this.service.findByIDProduct(id);
	}
	
	//create one Product
	@PostMapping
	public ResponseEntity<Message> createOneProduct(@RequestBody ProductDTO dto)
	{
		return this.service.createOneProduct(dto);
	}
	
	//update one Product
	@PutMapping("/{id}")
	public ResponseEntity<Message> updateOne(@PathVariable int id, @RequestBody ProductDTO dto) 
	{
		return this.service.updateOneProduct(id, dto);
	}
	
	//delete by Product ID	
	@DeleteMapping("/{id}")
	public ResponseEntity<Message> deleteByIdProduct(int id)
	{
		return this.service.deletByIdProduct(id);
	}
	
	
}
