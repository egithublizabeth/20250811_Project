package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.InventoryManagementAPI.dtos.WarehouseInventoryDTO;
import com.skillstorm.InventoryManagementAPI.idClasses.WarehouseInventoryId;
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
	@GetMapping("/{id}")
	public ResponseEntity<Iterable<WarehouseInventory>> findByWarehouseId (@PathVariable int id)
	{
		return this.service.findByWarehouseId(id);
	}
	
	//find a Warehouse Inventory by ID with Error Response
	@GetMapping("/product/{id}")
	public ResponseEntity<Iterable<WarehouseInventory>> findByProductId (@PathVariable int id)
	{
		return this.service.findByProductId(id);
	}
}
