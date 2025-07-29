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
		private int product_id;        //primary key
		
		@Column
		private String product_name;
		
		@Column
		private double price;
		
		//constructors
		public Product() 
		{
			super();
			// TODO Auto-generated constructor stub
		}

		public Product(int product_id, String product_name, double price) 
		{
			super();
			this.product_id = product_id;
			this.product_name = product_name;
			this.price = price;
		}

		//setters and getters
		public int getProduct_id() {
			return product_id;
		}

		public void setProduct_id(int product_id) {
			this.product_id = product_id;
		}

		public String getProduct_name() {
			return product_name;
		}

		public void setProduct_name(String product_name) {
			this.product_name = product_name;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
				
}
