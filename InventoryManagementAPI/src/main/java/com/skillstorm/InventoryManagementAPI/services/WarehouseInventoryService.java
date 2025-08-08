package com.skillstorm.InventoryManagementAPI.services;

import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.models.WarehouseInventory;
import com.skillstorm.InventoryManagementAPI.repositories.WarehouseInventoryRepository;

@Service
public class WarehouseInventoryService 
{
	//injecting a Repository bean, instantiate the final variable and set up the only constructor
	private final WarehouseInventoryRepository repo;
	
	public WarehouseInventoryService(WarehouseInventoryRepository repo)
	{
		this.repo = repo;
	}
	
	//find all warehouse inventory with error response (Method 1 of 7)
	public ResponseEntity<Iterable<WarehouseInventory>> findAllWarehouseInventory()
	{
		Iterable<WarehouseInventory> warehouseInventories = this.repo.findAll();
		
		if (!warehouseInventories.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouseInventories);
	}
	
	//find a Warehouse Inventory by ID with Error Response (Method 2 of 7)
	public ResponseEntity<Iterable<WarehouseInventory>> findByWarehouseId(int warehouseId)
	{		
		Iterable<WarehouseInventory> warehouseInventories = this.repo.findByWarehouseId(warehouseId);
		
		if (!warehouseInventories.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouseInventories);
	}
	
	//find all the warehouses that has this Product ID in stock with Error Response (Method 3 of 7)
	public ResponseEntity<Iterable<WarehouseInventory>> findByProductId(int productId)
	{		
		Iterable<WarehouseInventory> warehouses = this.repo.findByProductId(productId);
		
		if (!warehouses.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouses);
	}
	
	//find the products that are BELOW the MINIMUM threshold or within range (Method 4 of 7)
	public ResponseEntity<Iterable<WarehouseInventory>> findProductBelowByWarehouse(int warehouseId, int threshold)
	{
		Iterable<WarehouseInventory> warehouses = this.repo.findProductBelowByWarehouse(warehouseId, threshold);
		
		if (!warehouses.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouses);
	}
	
	//find the products that are ABOVE the MAXIMUM threshold or within range (Method 5 of 7)
	public ResponseEntity<Iterable<WarehouseInventory>> findProductAboveByWarehouse(int warehouseId, int threshold)
	{
		Iterable<WarehouseInventory> warehouses = this.repo.findProductAboveByWarehouse(warehouseId, threshold);
		
		if (!warehouses.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouses);
	}
	
	//find the most expensive product(s) in a warehouse and return limitValue records (Method 6 of 7)
	public ResponseEntity<Iterable<WarehouseInventory>> findByWarehouseMaxProductPrice(int warehouseId, int limitValue)
	{
		Iterable<WarehouseInventory> warehouses = this.repo.findByWarehouseMaxProductPrice(warehouseId).stream().limit(limitValue).collect(Collectors.toList());
		
		if (!warehouses.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouses);
	}
	
	//find the cheapest product(s) in a warehouse and return limitValue records (Method 7 of 7)
	public ResponseEntity<Iterable<WarehouseInventory>> findByWarehouseMinProductPrice(int warehouseId, int limitValue)
	{
		Iterable<WarehouseInventory> warehouses = this.repo.findByWarehouseMinProductPrice(warehouseId).stream().limit(limitValue).collect(Collectors.toList());
		
		if (!warehouses.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouses);
	}
		
}
