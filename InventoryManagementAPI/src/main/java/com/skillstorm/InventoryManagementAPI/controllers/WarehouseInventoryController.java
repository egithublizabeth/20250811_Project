package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.InventoryManagementAPI.models.WarehouseInventory;
import com.skillstorm.InventoryManagementAPI.services.WarehouseInventoryService;


@RestController
@RequestMapping("/warehouses")
public class WarehouseInventoryController 
{
	
	//injecting a Service bean, instantiate the final variable and set up the only constructor
	private final WarehouseInventoryService service;
	
	public WarehouseInventoryController(WarehouseInventoryService service)
	{
		this.service = service;
	}
		
	//find all Warehouse Inventory with Error Response
	@GetMapping
	public ResponseEntity<Iterable<WarehouseInventory>> findAllWarehouseInventory()
	{
		return this.service.findAllWarehouseInventory();
	}
	
	//find a Warehouse Inventory by ID with Error Response
	@GetMapping("/{warehouseId}")
	public ResponseEntity<WarehouseInventory> findByIDWarehouseInventory(@PathVariable ("warehouseId") int id)
	{
		return this.service.findByIDWarehouseInventory(id);
	}
	
	
}
