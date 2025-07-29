package com.skillstorm.InventoryManagementAPI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.models.WarehouseInventory;
import com.skillstorm.InventoryManagementAPI.repositories.WarehouseInventoryRepository;

@Service
public class WarehouseInventoryService 
{
	@Autowired
	private WarehouseInventoryRepository repo;
	
	//find all warehouse inventory records
	public Iterable<WarehouseInventory> findAllWarehouseInventory()
	{
		return this.repo.findAll();
	}
}
