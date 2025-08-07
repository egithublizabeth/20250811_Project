package com.skillstorm.InventoryManagementAPI.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.models.WarehouseOrder;
import com.skillstorm.InventoryManagementAPI.repositories.WarehouseOrderRepository;

@Service
public class WarehouseOrderService 
{
	//injecting a Repository bean, instantiate the final variable and set up the only constructor
	private final WarehouseOrderRepository repo;
	
	//constructor injection, only every going to have one of this class, annotation is optional since it's the only constructor
	public WarehouseOrderService(WarehouseOrderRepository repo) 
	{
		this.repo = repo;
	}
	
	//find all Warehouse Orders with error response
	public ResponseEntity<Iterable<WarehouseOrder>> findAllWarehouseOrder()
	{
		Iterable<WarehouseOrder> warehouseOrders = this.repo.findAll();
		
		if (!warehouseOrders.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.ok(warehouseOrders);
	}
	
	//find a Warehouse Order by Order ID with Error Response
	public ResponseEntity<WarehouseOrder> findByIdWarehouseOrder(int id)
	{
		Optional<WarehouseOrder> warehouseOrders = this.repo.findById(id);
		
		if (warehouseOrders.isPresent())
			return ResponseEntity.ok(warehouseOrders.get());
		return ResponseEntity.notFound().build();
		
	}
	
	//find all Warehouse Orders by Warehouse Id with error response
	public ResponseEntity<Iterable<WarehouseOrder>> findByWarehouseId(int warehouseId)
	{
		Iterable<WarehouseOrder> warehouseOrders = this.repo.findByWarehouseId(warehouseId);
		
		if (!warehouseOrders.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.ok(warehouseOrders);
	}
}
