package com.skillstorm.InventoryManagementAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Warehouse 
{
	//table fields/columns/properties
	@Id 						//primary key
	@Column
	private int warehouseId;  
	
	//to show a city & state associated with each warehouse record
	@ManyToOne
	@JoinColumn(name = "city_id", referencedColumnName = "cityId")
	@JsonIgnoreProperties({"cityId"})
	private City city;

	//constructors
	public Warehouse() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Warehouse(int warehouseId, City city) {
		super();
		this.warehouseId = warehouseId;
		this.city = city;
	}
	
	//getters and setters
	public int getWarehouseId() {
		return warehouseId;
	}

	public void setWarehouseId(int warehouseId) {
		this.warehouseId = warehouseId;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
	
}
