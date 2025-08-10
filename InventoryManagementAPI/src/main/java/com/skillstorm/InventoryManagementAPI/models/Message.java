package com.skillstorm.InventoryManagementAPI.models;

import java.util.HashMap;
import java.util.Map;

//this class will be use to return meaningful messages with Http Responses
public class Message 
{
	//variables 
	private String message;
	
	//a message object has a product so it can return the product in the message
	private Product product;
	
	//a message object has a random object to store information
	private Map<String, Integer> info = new HashMap<>();
	
	//constructor with no arguments
	public Message() {
		super();
	}
	
	//constructor with 2 arguments
	public Message(String message, Product product) 
	{
		super();
		setmessage(message);
		this.product = product;
	}
	
	//constructor with message argument
	public Message(String message) 
	{
		super();
		setmessage(message);
	}
	
	//constructor with message argument and an object
	public Message(String message, Map<String, Integer> info) 
	{
		super();
		setmessage(message);
		this.info = info;
	}
	
	
	//setters and getters
	public String getmessage() 
	{
		return message;
	}

	public void setmessage(String message) 
	{
		
		switch(message) 
		{
			case "validCreate":
				this.message = "Huzzah! Record has been created and added to the Product Table.";
				break;
			
			case "invalidCreate":
				this.message = "Bleh! This record exists already. You can not create a new record with the given parameters, try again.";
				break;
				
			case "validUpdate":
				this.message = "Whoopee! Record has been updated in the Product Table.";
				break;
				
			case "invalidUpdate":
				this.message = "Bummer! This record does not exist(DNE). You can not update a record that DNE, try again.";
				break;
				
			case "validDelete":
				this.message = "Cheers! The record was deleted.";
				break;
				
			case "validDeleteProduct":
				this.message = "Cheers! The record was deleted. Note this causes a 500 Error Response because the relationship between warehouse_inventory(child) table to product(parent) table: 'on delete' equal 'restrict'.";
				break;
				
			case "invalidDelete":
				this.message = "Yikes! The record does not exist(DNE), try again.";
				break;
				
			case "invalidLimitOver":
				this.message = "Dang! The limit you provided is greater than the number of records. Try again. If you want to see all products, use GET/products API endpoint.";
		}
		
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}

	public Map<String, Integer> getInfo() {
		return info;
	}

	public void setInfo(Map<String, Integer> info) {
		this.info = info;
	}
	
	

}
