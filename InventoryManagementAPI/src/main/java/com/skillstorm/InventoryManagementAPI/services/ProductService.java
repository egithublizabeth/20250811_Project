package com.skillstorm.InventoryManagementAPI.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.skillstorm.InventoryManagementAPI.dtos.ProductDTO;
import com.skillstorm.InventoryManagementAPI.models.Message;
import com.skillstorm.InventoryManagementAPI.models.Product;
import com.skillstorm.InventoryManagementAPI.repositories.ProductRepository;

@Service  //this specifies that this class is a service, typically used for all endpoint logic other than just pointing endpoints to their destinations
          //this class in an injectable Component/Bean
public class ProductService 
{
	//injecting a Repository bean, instantiate the final variable and set up the only constructor
	private final ProductRepository repo;
	
	//constructor injection, only every going to have one of this class, annotation is optional since it's the only constructor
	public ProductService(ProductRepository repo) 
	{
		this.repo = repo;
	}
	
	//****create an instance of Message object****
	private Message message;
	
	//find all products with error response
	public ResponseEntity<Iterable<Product>> findAllProduct()
	{
		Iterable<Product> products = this.repo.findAll();
		
		if (!products.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		return ResponseEntity.ok(products);
	}
	
	//find product with a limit of return records with error response
	public ResponseEntity<Object> findAllProductLimit(int limitValue)
	{
		//if the limitValue is greater than the table count then DO NOT GET any records
		if (limitValue >= this.repo.count()) 
		{
			//create an object to store info
			Map<String, Integer> infoObject = new HashMap<>();
			infoObject.put("Total Record Count", (int) this.repo.count());
			
			//create new message object for response body
			message = new Message("invalidLimitOver", infoObject);
			
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(message);
		}

		// create Pageable object so we can return 'x' number of products
		Pageable pageable = PageRequest.of(0, limitValue); 
		List<Product> products = this.repo.findAll(pageable);

		if (!products.iterator().hasNext())
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);

		return ResponseEntity.ok(products);
		
	}
	
	//find a Product by ID with Error Response
	public ResponseEntity<Product> findByIDProduct(int id)
	{
		Optional<Product> product = this.repo.findById(id);
		
		if (product.isPresent())
			return ResponseEntity.ok(product.get());
		return ResponseEntity.notFound().build();
		
	}
	
	//create one Product
	public ResponseEntity<Message> createOneProduct(ProductDTO dto)
	{
		//If ID DNE, create a new record, else return Error Response, we do not want to overwrite existing records
		if (!this.repo.existsById(dto.productId()))
		{
			//Clean up the product name
			String productName = cleanProductName(dto.productName());
			
			//create the product object
			Product product = new Product(dto.productId(), productName, dto.price(), null);
			
			//create/add the product record from the product object
			this.repo.save(product);
			
			//create a message object with responseBody that has a Product object
			message = new Message("validCreate", product);
			
			return ResponseEntity.status(HttpStatus.CREATED)
								 .body(message);
		}
		
		//the record exists already - create a message object with a responseBody that has no Product Object
		message = new Message("invalidCreate");
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
							 .body(message); 
	}
	
	//update one Product
	public ResponseEntity<Message> updateOneProduct(int id, ProductDTO dto) 
	{
		//if ID exists, update the record else return 404 Error Response
		if (this.repo.existsById(id))
		{
			//clean up the product name
			String productName = cleanProductName(dto.productName());
			
			//create the new product object
			Product product = new Product(id, productName, dto.price(), null);
			
			//update the record
			this.repo.save(product);
						
			//create a message object with responseBody that has a Product object
			message = new Message("validUpdate", product);
			
			return ResponseEntity.ok().body(message);
		}
		
		//id does not exist so you can not update it - create a message object with a responseBody that has no Product Object
		message = new Message("invalidUpdate");
				
		return ResponseEntity.status(HttpStatus.NOT_FOUND)
							 .body(message);
	}
	
	//delete one Product
	public ResponseEntity<Message> deletByIdProduct(int id)
	{
		//if id exists then delete the record, else record DNE
		if (this.repo.existsById(id))
		{	//find the record to delete to show the user which record was deleted
			Optional<Product> product = this.repo.findById(id);
			
			//convert the Optional type to Product type
			Product product1 = product.get();

			//create a message object with responseBody that has a Product object
			message = new Message("validDelete", product1);
			
			//delete the record by id
			this.repo.deleteById(id);
			
			//not correct response but allows body response information
			return ResponseEntity.status(HttpStatus.OK).body(message);  
		}
		
		//record DNE - create a message object with a responseBody that has no Product Object
		message = new Message("invalidDelete");

		return ResponseEntity.status(HttpStatus.NOT_FOUND)
				 			 .body(message);
	
		//return ResponseEntity.status(HttpStatus.NO_CONTENT).body(message); //a no_content can not have a body response
	}
	
	/* Method 1 of 1
	* input: String product name
	* output: String product Name 
	* objective: Trim, upper case, and delete multiple white spaces in a product name
    */
	public static String cleanProductName(String productName)
	{  
		
	    //instantiate variables
		int i;
		String[] productNameArray = null;
        ArrayList<String> nameArray = new ArrayList<>();
        String nameString = null;

		//trim white spaces and lower case, split all names by white spaces (white space is in between names)
		productNameArray = productName.trim().toLowerCase().split(" ");
   	
	   
	//for loop, if there is a blank space in the array, toss it, if not store the name in an ArrayList
       for (i=0; i < productNameArray.length; i++)
       {
       	if (productNameArray[i].isBlank()) //if the string is blank/white spaces
       		 continue; //do not include it, skip code and move to next iteration
       	else
       	{
       		//capitalize the first letter and add it to the ArrayList
       		String nameFixed = productNameArray[i].substring(0,1).toUpperCase() + productNameArray[i].substring(1);
       		nameArray.add(nameFixed);
       	}
       }
       
       //concatenate the name and assign it to nameString
       for (i=0; i < nameArray.size(); i++)
       {
       	if (i==0)
       		nameString = nameArray.get(i);
       	else
       		nameString = nameString + " " + nameArray.get(i);
       }
       
       return nameString;
	}

	
}
