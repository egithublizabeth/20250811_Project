package com.skillstorm.InventoryManagementAPI.idClasses;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Embeddable;

@Embeddable
public class OrderProductsId implements Serializable
{
	//table fields/columns/properties
	private int orderId;
	private int productId;
	private int qty;
	
	//constructors
	public OrderProductsId() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderProductsId(int orderId, int productId, int qty) {
		super();
		this.orderId = orderId;
		this.productId = productId;
		this.qty = qty;
	}

	//getters and setters
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	@Override
	public int hashCode() {
		return Objects.hash(orderId, productId, qty);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderProductsId other = (OrderProductsId) obj;
		return orderId == other.orderId && productId == other.productId && qty == other.qty;
	}
	
}
