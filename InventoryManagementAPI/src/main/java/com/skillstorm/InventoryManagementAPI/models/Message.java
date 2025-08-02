package com.skillstorm.InventoryManagementAPI.models;

//this class will be use to return meaningful messages with Http Responses
public class Message 
{
	//variables 
	private String message;
	
	//a message object has a product so it can return the product in the message
	private Product product;

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
				
			case "invalidDelete":
				this.message = "Yikes! The record does not exist(DNE), try again.";
		}
		
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}

}
