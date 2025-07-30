package com.skillstorm.InventoryManagementAPI.services;

import java.util.Optional;

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
	
	//find all warehouse inventory with error response
	public ResponseEntity<Iterable<WarehouseInventory>> findAllWarehouseInventory()
	{
		Iterable<WarehouseInventory> warehouseInventories = this.repo.findAll();
		
		if (!warehouseInventories.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		
		return ResponseEntity.ok(warehouseInventories);
	}
	
	//find a Warehouse Inventory by ID with Error Response
	public ResponseEntity<WarehouseInventory> findByIDWarehouseInventory(int id)
	{
		Optional<WarehouseInventory> warehouseInventories = this.repo.findById(id);
		
		if (warehouseInventories.isPresent())
			return ResponseEntity.ok(warehouseInventories.get());
		return ResponseEntity.notFound().build();
		
	}
	
	
}
