package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.InventoryManagementAPI.models.Product;
import com.skillstorm.InventoryManagementAPI.services.ProductService;

@RestController //composite annotation of @Controller and @ResponseBody
                // @Controller sets this class as a file that parses endpoints
				// any endpoints listed properly here will be available for users to interact with
				// @ResponseBody says that this class DOES NOT return HTML views but HttpResponse information in the body (no webpage, just a json/xml response)

@RequestMapping("/products") //all requests formated like "localhost:8080/products" ... will route to this controller
public class ProductController 
{
	@Autowired
	private ProductService service;
	
	//find all labels
	@GetMapping //this method will handle a GET request to /products with no additional suffix
	public Iterable<Product> findAllProduct()
	{
		return this.service.findAllProduct();
	}
	
}
