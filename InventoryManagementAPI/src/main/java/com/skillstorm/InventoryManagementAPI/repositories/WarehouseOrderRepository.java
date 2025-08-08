package com.skillstorm.InventoryManagementAPI.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.InventoryManagementAPI.models.WarehouseOrder;

import jakarta.transaction.Transactional;

@Repository

public interface WarehouseOrderRepository extends CrudRepository<WarehouseOrder, Integer>
{
	//method to see all orders associated to a warehouse (Method 1 of 1)
	@Transactional
	@Modifying
	@Query(value = "SELECT * FROM warehouse_order where warehouse_id = ?1 order by order_date desc", nativeQuery = true)
	Iterable<WarehouseOrder> findByWarehouseId(int warehouseId);

}
