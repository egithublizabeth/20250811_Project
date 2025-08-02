package com.skillstorm.InventoryManagementAPI.models;

import com.skillstorm.InventoryManagementAPI.idClasses.WarehouseInventoryId;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/*
 * this class is an entity -- it maps to a table in our database -- one record in that table = one object of this class
 */

@Entity  //states this class is a DB entity
@Table  //states which table this class corresponds to, JPA auto-converts column/table names to their java equivalents (name = "warehouse_inventory")  
public class WarehouseInventory 
{

	@EmbeddedId
	private WarehouseInventoryId id;
	
	// constructors
	public WarehouseInventory() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public WarehouseInventory(WarehouseInventoryId id) {
		super();
		this.id = id;
	}

	// setters and getters
	public WarehouseInventoryId getId() {
		return id;
	}

	public void setId(WarehouseInventoryId id) {
		this.id = id;
	}

}
