package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.InventoryManagementAPI.models.WarehouseInventory;
import com.skillstorm.InventoryManagementAPI.services.WarehouseInventoryService;


@RestController
@RequestMapping("/warehouses")
public class WarehouseInventoryController 
{
	@Autowired
	private WarehouseInventoryService service;
	
	//find all warehouse inventory
	@GetMapping
	public Iterable<WarehouseInventory> findAllWarehouseInventory()
	{
		return this.service.findAllWarehouseInventory();
	}
}
