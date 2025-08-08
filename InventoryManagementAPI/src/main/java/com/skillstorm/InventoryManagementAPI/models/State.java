package com.skillstorm.InventoryManagementAPI.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity //states this class is a DB entity
@Table //states which table this corresponds to
public class State 
{
	//table fields/columns/properties
	@Id  //primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)  //auto-increment
	@Column 
	private int stateId;
	
	@Column
	private String stateName;
	
	//to show a list of cities associated with each state record
	@OneToMany(mappedBy = "state")
	@JsonIgnoreProperties({"state", "cityId"})
	private List<City> cities;

	//constructors
	public State() {
		super();
	}

	public State(int stateId, String stateName, List<City> cities) {
		super();
		this.stateId = stateId;
		this.stateName = stateName;
		this.cities = cities;
	}
	
	//getters and setters
	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public List<City> getCities() {
		return cities;
	}

	public void setCities(List<City> cities) {
		this.cities = cities;
	}
	
}
