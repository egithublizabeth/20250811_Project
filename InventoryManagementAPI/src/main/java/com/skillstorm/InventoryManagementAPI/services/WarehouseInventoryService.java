package com.skillstorm.InventoryManagementAPI.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.dtos.WarehouseInventoryDTO;
import com.skillstorm.InventoryManagementAPI.idClasses.WarehouseInventoryId;
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
	
	//find all warehouse inventory with error response
	public ResponseEntity<Iterable<WarehouseInventory>> findAllWarehouseInventory()
	{
		Iterable<WarehouseInventory> warehouseInventories = this.repo.findAll();
		
		if (!warehouseInventories.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouseInventories);
	}
	
	//find a Warehouse Inventory by ID with Error Response
	public ResponseEntity<Iterable<WarehouseInventory>> findByWarehouseId(int warehouseId)
	{		
		Iterable<WarehouseInventory> warehouseInventories = this.repo.findByWarehouseId(warehouseId);
		
		if (!warehouseInventories.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouseInventories);
	}
	
	//find a all the Warehouses that carry/hold a specific Product by ID with Error Response
	public ResponseEntity<Iterable<WarehouseInventory>> findByProductId(int productId)
	{		
		Iterable<WarehouseInventory> warehouses = this.repo.findByProductId(productId);
		
		if (!warehouses.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouses);
	}
		
		
}
