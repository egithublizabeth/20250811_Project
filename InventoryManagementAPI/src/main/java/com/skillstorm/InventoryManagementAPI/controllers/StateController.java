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
	
	//find all Products with Error Response
	@GetMapping
	public ResponseEntity<Iterable<State>> findAllState()
	{
		return this.service.findAllState();
	}
	
	//find by Product ID with Error Response
	@GetMapping("/{stateId}")
	public ResponseEntity<State> findByIDState(@PathVariable("stateId") int id)
	{
		return this.service.findByIDState(id);
	}

}
