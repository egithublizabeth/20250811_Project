package com.skillstorm.InventoryManagementAPI.services;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.models.OrderProducts;
import com.skillstorm.InventoryManagementAPI.repositories.OrderProductsRepository;

@Service
public class OrderProductsService 
{
	//injecting a Repository bean, instantiate the final variable and set up the only constructor
	private final OrderProductsRepository repo;
	
	//constructor injection, only every going to have one of this class, annotation is optional since it's the only constructor
	public OrderProductsService(OrderProductsRepository repo) 
	{
		this.repo = repo;
	}
	
	//find all Order Products with Error Response (Method 1 of 3)
	public ResponseEntity<Iterable<OrderProducts>> findAllOrderProducts()
	{
		Iterable<OrderProducts> ordersProducts = this.repo.findAll();
		
		if (!ordersProducts.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.ok(ordersProducts);
	}
	
	//find all Order Products by Order ID with Error Response (Method 2 of 3)
	public ResponseEntity<Iterable<OrderProducts>> findByOrderId(int id)
	{
		Iterable<OrderProducts> warehouseOrders = this.repo.findByOrderId(id);
		
		if (!warehouseOrders.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.ok(warehouseOrders);
		
	}
	
	//find all Order Products by Product Id with Error Response (Method 3 of 3)
	public ResponseEntity<Iterable<OrderProducts>> findByProductId(int productId)
	{
		Iterable<OrderProducts> warehouseOrders = this.repo.findByProductId(productId);
		
		if (!warehouseOrders.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.ok(warehouseOrders);
	}
	
}
