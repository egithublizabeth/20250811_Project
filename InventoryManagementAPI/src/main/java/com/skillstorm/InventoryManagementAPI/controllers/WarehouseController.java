package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.skillstorm.InventoryManagementAPI.models.Warehouse;
import com.skillstorm.InventoryManagementAPI.services.WarehouseService;

@Controller
@RequestMapping ("/warehouses_info")
public class WarehouseController
{
	//injecting a Service bean, instantiate the final variable and set up the only constructor
	private final WarehouseService service;
	
	public WarehouseController(WarehouseService service)
	{
		this.service = service;
	}
	
	//find all Products with Error Response
	@GetMapping
	public ResponseEntity<Iterable<Warehouse>> findAllWarehouse()
	{
		return this.service.findAllWarehouse();
	}
	
	//find by Product ID with Error Response
	@GetMapping("/{warehouseId}")
	public ResponseEntity<Warehouse> findByIDWarehouse(@PathVariable("warehouseId") int id)
	{
		return this.service.findByIDWarehouse(id);
	}
}
