package com.skillstorm.InventoryManagementAPI.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.InventoryManagementAPI.models.WarehouseInventory;
import com.skillstorm.InventoryManagementAPI.services.WarehouseInventoryService;

import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;


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
	
	//find all the Warehouses that has this Product ID in stock with Error Response
	@GetMapping("/product/{id}")
	public ResponseEntity<Iterable<WarehouseInventory>> findByProductId (@PathVariable int id)
	{
		return this.service.findByProductId(id);
	}
	
	//find the most expensive products in a warehouse
	@GetMapping("/{warehouseId}/max-product-price-desc/{limitValue}")
	public ResponseEntity<Iterable<WarehouseInventory>> findByWarehouseMaxProductPrice(@PathVariable int warehouseId, @Validated @PathVariable @Positive(message = "limitValue > 0")int limitValue)
	{
		return this.service.findByWarehouseMaxProductPrice(warehouseId, limitValue);
	}
	
	//find the cheapest products in a warehouse
	@GetMapping("/{warehouseId}/min-product-price-asc/{limitValue}")
	public ResponseEntity<Iterable<WarehouseInventory>> findByWarehouseMinProductPrice(@PathVariable int warehouseId, @Validated @PathVariable @Positive(message = "limitValue > 0")int limitValue)
	{
		return this.service.findByWarehouseMinProductPrice(warehouseId, limitValue);
	}
	
	//find the products that are BELOW the MINIMUM threshold or with in range
	@GetMapping("/{warehouseId}/product-below-threshold/{threshold}")
	public ResponseEntity<Iterable<WarehouseInventory>> findProductBelowByWarehouse(@PathVariable int warehouseId, @Validated @PathVariable @PositiveOrZero(message = "threshold >= 0") int threshold)
	{
		return this.service.findProductBelowByWarehouse(warehouseId, threshold);
	}
	
	//find the products that are ABOVE the MAXIMUM threshold or with in range
	@GetMapping("/{warehouseId}/product-above-threshold/{threshold}")
	public ResponseEntity<Iterable<WarehouseInventory>> findProductAboveByWarehouse(@PathVariable int warehouseId, @Validated @PathVariable @PositiveOrZero(message = "threshold >= 0") int threshold)
	{
		return this.service.findProductAboveByWarehouse(warehouseId, threshold);
	}
	
}
