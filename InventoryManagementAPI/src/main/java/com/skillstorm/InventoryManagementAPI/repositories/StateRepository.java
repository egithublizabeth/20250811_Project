package com.skillstorm.InventoryManagementAPI.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.skillstorm.InventoryManagementAPI.models.State;

@Repository 
/* states this class is a Spring Repository with built in methods to interact with the database,
   this interface is available as a component (a special type of bean) and can be injected into other classes if needed
*/
public interface StateRepository extends CrudRepository< State, Integer>
{

}
