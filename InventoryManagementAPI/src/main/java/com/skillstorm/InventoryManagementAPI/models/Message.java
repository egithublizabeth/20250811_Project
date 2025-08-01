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
		// TODO Auto-generated constructor stub
	}
	
	//constructor with 2 arguments
	public Message(String message, Product product) 
	{
		super();
		this.message = message;
		this.product = product;
	}
	
	//constructor with message argument
	public Message(String message) 
	{
		super();
		this.message = message;
	}
	
	
	//setters and getters
	public String getmessage() 
	{
		return message;
	}


	public void setmessage(String message) 
	{
		this.message = message;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}

}
