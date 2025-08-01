package com.skillstorm.InventoryManagementAPI.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.models.Warehouse;
import com.skillstorm.InventoryManagementAPI.repositories.WarehouseRepository;

@Service
public class WarehouseService 
{

	//injecting a Repository bean, instantiate the final variable and set up the only constructor
	private final WarehouseRepository repo;
	
	//constructor injection, only every going to have one of this class, annotation is optional since it's the only constructor
	public WarehouseService(WarehouseRepository repo) 
	{
		this.repo = repo;
	}
	
	//find all Warehouses with error response
	public ResponseEntity<Iterable<Warehouse>> findAllWarehouse()
	{
		Iterable<Warehouse> warehouses = this.repo.findAll();
		
		if (!warehouses.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.ok(warehouses);
	}
	
	//find a Warehouse by ID with Error Response
	public ResponseEntity<Warehouse> findByIDWarehouse(int id)
	{
		Optional<Warehouse> warehouse = this.repo.findById(id);
		
		if (warehouse.isPresent())
			return ResponseEntity.ok(warehouse.get());
		return ResponseEntity.notFound().build();
		
	}
}
