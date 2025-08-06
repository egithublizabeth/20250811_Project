package com.skillstorm.InventoryManagementAPI.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.InventoryManagementAPI.models.Product;

@Repository  //states this class is a Spring Repository with built in methods to interact with the database,
             //this interface is available as a component (a special type of bean) and can be injected into other classes if needed

public interface ProductRepository extends CrudRepository< Product, Integer >  //<import model class name, data type>
{

	//this method is used for the findAllProductLimit() in the service file
	List<Product> findAll(Pageable pageable);
	
}
