package com.skillstorm.InventoryManagementAPI.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.models.City;
import com.skillstorm.InventoryManagementAPI.repositories.CityRepository;

@Service

public class CityService 
{
	//injecting a Repository bean, instantiate the final variable and set up the only constructor
	private final CityRepository repo;
	
	//constructor injection, only every going to have one of this class, annotation is optional since it's the only constructor
	public CityService(CityRepository repo) 
	{
		this.repo = repo;
	}
	
	//find all cities with Error Response (Method 1 of 2)
	public ResponseEntity<Iterable<City>> findAllCity()
	{
		Iterable<City> cities = this.repo.findAll();
		
		if (!cities.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.ok(cities);
	}
	
	//find a city by ID with Error Response (Method 2 of 2)
	public ResponseEntity<City> findByIDCity(int id)
	{
		Optional<City> city = this.repo.findById(id);
		
		if (city.isPresent())
			return ResponseEntity.ok(city.get());
		return ResponseEntity.notFound().build();
	}
	
}
