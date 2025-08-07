package com.skillstorm.InventoryManagementAPI.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.InventoryManagementAPI.idClasses.OrderProductsId;
import com.skillstorm.InventoryManagementAPI.models.OrderProducts;

import jakarta.transaction.Transactional;

@Repository
public interface OrderProductsRepository extends CrudRepository<OrderProducts, OrderProductsId>
{
	
	//method to see all order products associated to an order id
	@Transactional
	@Modifying
	@Query(value = "SELECT * FROM order_products where order_id = ?1", nativeQuery = true)
	Iterable<OrderProducts> findByOrderId(int orderId);

	
	//method to see all order products associated to a product id
	@Transactional
	@Modifying
	@Query(value = "SELECT * FROM order_products where product_id = ?1	", nativeQuery = true)
	Iterable<OrderProducts> findByProductId(int productId);


}
