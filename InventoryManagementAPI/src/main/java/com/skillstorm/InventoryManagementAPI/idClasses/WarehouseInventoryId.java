package com.skillstorm.InventoryManagementAPI.idClasses;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class WarehouseInventoryId implements Serializable
{
	// table fields/columns/properties
	private int warehouseId;     //composite key
	
	@Column(insertable=false, updatable=false)
	private int productId;       //composite key
	private int productQty;
	private String productLocation;
	private int productMinQty;
	private int productMaxQty;
	
	
	// constructors
	public WarehouseInventoryId() {
		super();
		// TODO Auto-generated constructor stub
	}


	public WarehouseInventoryId(int warehouseId, int productId, int productQty, String productLocation,
			int productMinQty, int productMaxQty) {
		super();
		this.warehouseId = warehouseId;
		this.productId = productId;
		this.productQty = productQty;
		this.productLocation = productLocation;
		this.productMinQty = productMinQty;
		this.productMaxQty = productMaxQty;
	}


	public int getWarehouseId() {
		return warehouseId;
	}


	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}


	public int getProductId() {
		return productId;
	}


	public void setProductId(int productId) {
		this.productId = productId;
	}


	public int getProductQty() {
		return productQty;
	}


	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}


	public String getProductLocation() {
		return productLocation;
	}


	public void setProductLocation(String productLocation) {
		this.productLocation = productLocation;
	}


	public int getProductMinQty() {
		return productMinQty;
	}


	public void setProductMinQty(int productMinQty) {
		this.productMinQty = productMinQty;
	}


	public int getProductMaxQty() {
		return productMaxQty;
	}


	public void setProductMaxQty(int productMaxQty) {
		this.productMaxQty = productMaxQty;
	}


	@Override
	public int hashCode() {
		return Objects.hash(productId, productLocation, productMaxQty, productMinQty, productQty, warehouseId);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		WarehouseInventoryId other = (WarehouseInventoryId) obj;
		return productId == other.productId && Objects.equals(productLocation, other.productLocation)
				&& productMaxQty == other.productMaxQty && productMinQty == other.productMinQty
				&& productQty == other.productQty && warehouseId == other.warehouseId;
	}


	
}
