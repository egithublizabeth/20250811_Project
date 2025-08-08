package com.skillstorm.InventoryManagementAPI.services;

import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.models.State;
import com.skillstorm.InventoryManagementAPI.repositories.StateRepository;

@Service

public class StateService 
{

	//injecting a Repository bean, instantiate the final variable and set up the only constructor
	private final StateRepository repo;
	
	//constructor injection, only every going to have one of this class, annotation is optional since it's the only constructor
	public StateService(StateRepository repo) 
	{
		this.repo = repo;
	}
	
	//find all States with Error Response (Method 1 of 2)
	public ResponseEntity<Iterable<State>> findAllState()
	{
		Iterable<State> states = this.repo.findAll();
		
		if (!states.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.ok(states);
	}
	
	//find a State by ID with Error Response (Method 2 of 2)
	public ResponseEntity<State> findByIDState(int id)
	{
		Optional<State> state = this.repo.findById(id);
		
		if (state.isPresent())
			return ResponseEntity.ok(state.get());
		return ResponseEntity.notFound().build();
		
	}
	
}
