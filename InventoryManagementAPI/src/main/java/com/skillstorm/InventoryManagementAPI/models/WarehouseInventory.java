package com.skillstorm.InventoryManagementAPI.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * this class is an entity -- it maps to a table in our database -- one record in that table = one object of this class
 */

@Entity  //states this class is a DB entity
@Table  //states which table this class corresponds to, JPA auto-converts column/table names to their java equivalents (name = "warehouse_inventory")  
public class WarehouseInventory 
{
	// table fields/columns/properties
	
	//need to add composite key annotation
	@Id    //inserted so program will run
	@Column
	private int warehouse_id;     //composite key
	
	//need to add composite key annotation
	@Column
	private int product_id;       //composite key
	
	@Column
	private int product_qty;
	
	@Column
	private String product_location;
	
	@Column
	private int product_min_qty;
	
	@Column
	private int product_max_qty;
	
	// constructors
	public WarehouseInventory() 
	{
		super();
		// TODO Auto-generated constructor stub
	}

	public WarehouseInventory(int warehouse_id, int product_id, int product_qty, String product_location,
			int product_min_qty, int product_max_qty) 
	{
		super();
		this.warehouse_id = warehouse_id;
		this.product_id = product_id;
		this.product_qty = product_qty;
		this.product_location = product_location;
		this.product_min_qty = product_min_qty;
		this.product_max_qty = product_max_qty;
	}

	//setter and getters
	public int getWarehouse_id() {
		return warehouse_id;
	}
	
	//composite key - need to edit
	public void setWarehouse_id(int warehouse_id) {
		this.warehouse_id = warehouse_id;
	}

	public int getProduct_id() {
		return product_id;
	}

	//composite key - need to edit
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public int getProduct_qty() {
		return product_qty;
	}

	public void setProduct_qty(int product_qty) {
		this.product_qty = product_qty;
	}

	public String getProduct_location() {
		return product_location;
	}

	public void setProduct_location(String product_location) {
		this.product_location = product_location;
	}

	public int getProduct_min_qty() {
		return product_min_qty;
	}

	public void setProduct_min_qty(int product_min_qty) {
		this.product_min_qty = product_min_qty;
	}

	public int getProduct_max_qty() {
		return product_max_qty;
	}

	public void setProduct_max_qty(int product_max_qty) {
		this.product_max_qty = product_max_qty;
	}
	
    
	
}
