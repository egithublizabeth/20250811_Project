package com.skillstorm.InventoryManagementAPI.repositories;

import java.util.List;

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
	Iterable<WarehouseInventory> findByWarehouseId(int warehouseId);
	
	//method to see all warehouses that hold a specific product
	@Transactional
	@Modifying
	@Query(value = "SELECT * FROM warehouse_inventory where product_id = ?1" , nativeQuery = true)
	Iterable<WarehouseInventory> findByProductId(int productId);

	//find the products that are BELOW the MINIMUM threshold or within range
	@Transactional
	@Modifying
	@Query(value = "SELECT * FROM warehouse_inventory as a "
			+ "where a.warehouse_id = ?1 and"
			+ "( ( a.product_qty between  (a.product_min_qty - ?2) AND (a.product_min_qty + ?2) )"
			+ "	 or (a.product_qty <= a.product_min_qty)"
			+ ")" , nativeQuery = true)
	Iterable<WarehouseInventory> findProductBelowByWarehouse(int warehouseId, int threshold);
	
	//find the products that are ABOVE the MAXIMUM threshold or within range
	@Transactional
	@Modifying
	@Query(value = "SELECT * FROM warehouse_inventory as a "
			+ "where a.warehouse_id = ?1 and"
			+ "( ( a.product_qty between (a.product_max_qty - ?2) AND (a.product_max_qty + ?2) )"
			+ "	 or (a.product_qty >= a.product_max_qty)"
			+ ")" , nativeQuery = true)
	Iterable<WarehouseInventory> findProductAboveByWarehouse(int warehouseId, int threshold);
	
	
	//find the most expensive product(s) in a warehouse and return limitValue records
	@Transactional
	@Modifying
	@Query(value = "SELECT a.warehouse_id, a.product_id, a.product_qty, b.price, b.product_name, "
					+ "a.product_location, a.product_min_qty, a.product_max_qty "
					+ "FROM warehouse_inventory as a "
					+ "Inner Join product as b "
					+ "on a.product_id = b.product_id "
					+ "WHERE warehouse_id = ?1 "
					+ "ORDER BY b.price DESC" , nativeQuery = true)
	List<WarehouseInventory> findByWarehouseMaxProductPrice(int warehouseId);
	
	//find the cheapest product(s) in a warehouse and return limitValue records
	@Transactional
	@Modifying
	@Query(value = "SELECT a.warehouse_id, a.product_id, a.product_qty, b.price, b.product_name, "
					+ "a.product_location, a.product_min_qty, a.product_max_qty "
					+ "FROM warehouse_inventory as a "
					+ "Inner Join product as b "
					+ "on a.product_id = b.product_id "
					+ "WHERE warehouse_id = ?1 "
					+ "ORDER BY b.price ASC" , nativeQuery = true)
	List<WarehouseInventory> findByWarehouseMinProductPrice(int warehouseId);
	
}