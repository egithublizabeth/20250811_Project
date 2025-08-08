package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.InventoryManagementAPI.models.OrderProducts;
import com.skillstorm.InventoryManagementAPI.services.OrderProductsService;

@RestController
@RequestMapping("/order-products")
public class OrderProductsController 
{
	//injecting a Service bean, instantiate the final variable and set up the only constructor
	private final OrderProductsService service;
	
	public OrderProductsController(OrderProductsService service)
	{
		this.service = service;
	}
	
	//find all Order Products with Error Response (Method 1 of 3)
	@GetMapping
	public ResponseEntity<Iterable<OrderProducts>> findAllOrderProducts()
	{
		return this.service.findAllOrderProducts();
	}
	
	//find all Order Products by Order ID with Error Response (Method 2 of 3)
	@GetMapping("/order-id/{orderId}")
	public ResponseEntity<Iterable<OrderProducts>> findByOrderId(@PathVariable("orderId") int id)
	{
		return this.service.findByOrderId(id);
	}
	
	//find all Order Products by Product Id with Error Response (Method 3 of 3)
	@GetMapping("/product-id/{productId}")
	public ResponseEntity<Iterable<OrderProducts>> findByProductId(@PathVariable("productId") int id)
	{
		return this.service.findByProductId(id);
	}
	
}
