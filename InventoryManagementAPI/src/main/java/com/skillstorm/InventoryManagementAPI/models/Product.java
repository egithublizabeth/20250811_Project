package com.skillstorm.InventoryManagementAPI.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;


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
		@Positive(message = "Product Id > 0")
		private int productId;        //primary key
		
		@Column
		@NotBlank(message = "Product name can't be empty")
		@Size(min = 1, max = 100, message = "Minimum string length is 1 and maximum length is 100")
		private String productName;
		
		@Column
		@PositiveOrZero(message = "Price >= $0")
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
				
}
