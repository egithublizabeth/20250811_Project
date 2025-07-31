package com.skillstorm.InventoryManagementAPI.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/*
 * this class is an entity -- it maps to a table in our database -- one record in that table = one object of this class
 */

@Entity     //states this class is a DB entity
@Table     //states which table this class corresponds to (name = "product")
public class Product 
{
		//table fields/columns/properties
		@Id                            //primary key
		@Column
		private int productId;        //primary key
		
		@Column
		private String productName;
		
		@Column
		private double price;
		
		//constructors
		public Product() 
		{
			super();
			// TODO Auto-generated constructor stub
		}

		public Product(int productId, String productName, double price) {
			super();
			this.productId = productId;
			this.productName = productName;
			this.price = price;
		}

		public int getProductId() {
			return productId;
		}

		public void setProductId(int productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		//toString() to return a String in JSON object format
		@Override
		public String toString() {
			return "{\n" 
						+ "     " + "\"productId\": " + productId + ",\n" 
						+ "     " + "\"productName\": \"" + productName + "\",\n"
						+ "     " + "\"price\": " + price 
					+ "\n}";
		}

				
}
