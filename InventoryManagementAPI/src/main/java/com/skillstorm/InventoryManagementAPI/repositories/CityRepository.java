package com.skillstorm.InventoryManagementAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.InventoryManagementAPI.models.City;

@Repository

public interface CityRepository extends CrudRepository< City, Integer >
{

}
