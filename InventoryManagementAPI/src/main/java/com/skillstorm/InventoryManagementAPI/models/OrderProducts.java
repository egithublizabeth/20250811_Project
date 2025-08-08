package com.skillstorm.InventoryManagementAPI.models;

import com.skillstorm.InventoryManagementAPI.idClasses.OrderProductsId;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "order_products")
public class OrderProducts 
{
	@EmbeddedId
	private OrderProductsId id;

	//constructors
	public OrderProducts() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderProducts(OrderProductsId id) {
		super();
		this.id = id;
	}

	//getters and setters
	public OrderProductsId getId() {
		return id;
	}

	public void setId(OrderProductsId id) {
		this.id = id;
	}
	
}
