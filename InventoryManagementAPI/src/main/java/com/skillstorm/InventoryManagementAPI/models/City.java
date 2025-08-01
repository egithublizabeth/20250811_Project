package com.skillstorm.InventoryManagementAPI.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity   //states this class is a DB entity
@Table    //states which table this class corresponds to
public class City 
{
	//table fields/columns/properties
	@Id 				 //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto-increment
	@Column 
	private int cityId;  //primary key
	
	@Column 
	private String cityName;
	
	@ManyToOne
	@JoinColumn(name = "state_id", referencedColumnName = "stateId")
	@JsonIgnoreProperties({"cities", "stateId"})
	private State state;

	//constructors
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public City(int cityId, String cityName, State state) {
		super();
		this.cityId = cityId;
		this.cityName = cityName;
		this.state = state;
	}

	//setters and getters
	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	
	
	

}
