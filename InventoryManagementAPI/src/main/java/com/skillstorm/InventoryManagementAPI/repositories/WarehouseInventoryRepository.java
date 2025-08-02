package com.skillstorm.InventoryManagementAPI.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.InventoryManagementAPI.idClasses.WarehouseInventoryId;
import com.skillstorm.InventoryManagementAPI.models.WarehouseInventory;

import jakarta.transaction.Transactional;

@Repository
public interface WarehouseInventoryRepository extends CrudRepository < WarehouseInventory, WarehouseInventoryId>
{
	
	//method to see all available inventory/products associated to a warehouse
	@Transactional
	@Modifying
	@Query(value = "SELECT * FROM warehouse_inventory where warehouse_id = ?1", nativeQuery = true)
	Iterable<WarehouseInventory> findByWarehouseId(int warehouse_id);
	
	//method to see all warehouses that hold a specific product
	@Transactional
	@Modifying
	@Query(value = "SELECT * FROM warehouse_inventory where product_id = ?1" , nativeQuery = true)
	Iterable<WarehouseInventory> findByProductId(int product_id);
	
}