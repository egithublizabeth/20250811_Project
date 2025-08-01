package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.InventoryManagementAPI.models.City;
import com.skillstorm.InventoryManagementAPI.services.CityService;

@RestController

@RequestMapping("/cities")
public class CityController 
{
	//injecting a Service bean, instantiate the final variable and set up the only constructor
	private final CityService service;
	
	public CityController(CityService service)
	{
		this.service = service;
	}
	
	//find all Products with Error Response
	@GetMapping
	public ResponseEntity<Iterable<City>> findAllCity()
	{
		return this.service.findAllCity();
	}
	
	//find by Product ID with Error Response
	@GetMapping("/{cityId}")
	public ResponseEntity<City> findByIDCity(@PathVariable("cityId") int id)
	{
		return this.service.findByIDCity(id);
	}
}
