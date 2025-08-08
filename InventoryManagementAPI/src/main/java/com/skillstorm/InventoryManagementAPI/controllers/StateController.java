package com.skillstorm.InventoryManagementAPI.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.skillstorm.InventoryManagementAPI.models.State;
import com.skillstorm.InventoryManagementAPI.services.StateService;

@RestController
@RequestMapping("/states")
public class StateController 
{
	//injecting a Service bean, instantiate the final variable and set up the only constructor
	private final StateService service;
	
	public StateController(StateService service)
	{
		this.service = service;
	}
	
	//find all States with Error Response (Method 1 of 2)
	@GetMapping
	public ResponseEntity<Iterable<State>> findAllState()
	{
		return this.service.findAllState();
	}
	
	//find a State by ID with Error Response (Method 2 of 2)
	@GetMapping("/{stateId}")
	public ResponseEntity<State> findByIDState(@PathVariable("stateId") int id)
	{
		return this.service.findByIDState(id);
	}

}
