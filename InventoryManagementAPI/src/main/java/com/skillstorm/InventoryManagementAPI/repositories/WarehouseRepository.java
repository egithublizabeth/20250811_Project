package com.skillstorm.InventoryManagementAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.InventoryManagementAPI.models.Warehouse;

@Repository
public interface WarehouseRepository extends CrudRepository< Warehouse, Integer>
{

}
