package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.InventoryManagementAPI.models.WarehouseOrder;
import com.skillstorm.InventoryManagementAPI.services.WarehouseOrderService;

@RestController
@RequestMapping("/warehouses-orders")
public class WarehouseOrderController 
{
	//injecting a Service bean, instantiate the final variable and set up the only constructor
		private final WarehouseOrderService service;
		
		public WarehouseOrderController(WarehouseOrderService service)
		{
			this.service = service;
		}
		
		//find all Warehouse Orders with Error Response
		@GetMapping
		public ResponseEntity<Iterable<WarehouseOrder>> findAllWarehouseOrder()
		{
			return this.service.findAllWarehouseOrder();
		}
		
		//find Warehouse Order by order ID with Error Response
		@GetMapping("/order-id/{orderId}")
		public ResponseEntity<WarehouseOrder> findByIdWarehouseOrder(@PathVariable("orderId") int id)
		{
			return this.service.findByIdWarehouseOrder(id);
		}
		
		//find Warehouse Orders by Warehouse ID with Error Response
		@GetMapping("/warehouse-id/{warehouseId}")
		public ResponseEntity<Iterable<WarehouseOrder>> findByIdWarehouseId(@PathVariable("warehouseId") int id)
		{
			return this.service.findByWarehouseId(id);
		}
		
}
