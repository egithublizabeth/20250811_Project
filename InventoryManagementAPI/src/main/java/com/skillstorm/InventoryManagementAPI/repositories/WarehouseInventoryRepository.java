package com.skillstorm.InventoryManagementAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.InventoryManagementAPI.models.WarehouseInventory;

@Repository
public interface WarehouseInventoryRepository extends CrudRepository<WarehouseInventory, Integer>
{

}
