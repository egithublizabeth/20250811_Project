package com.skillstorm.InventoryManagementAPI.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.models.Product;
import com.skillstorm.InventoryManagementAPI.repositories.ProductRepository;

@Service  //this specifies that this class is a service, typically used for all endpoint logic other than just pointing endpoints to their destinations
          //this class in an injectable Component/Bean
public class ProductService 
{
	@Autowired
	private ProductRepository repo;
	
	//find all products
	public Iterable<Product> findAllProduct()
	{
		return this.repo.findAll();
	}
	
}
