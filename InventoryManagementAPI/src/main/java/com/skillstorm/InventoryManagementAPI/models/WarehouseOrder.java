package com.skillstorm.InventoryManagementAPI.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "warehouse_order")
public class WarehouseOrder 
{
	//table fields/columns/properties
		@Id  //primary key
		@Column 
		private int warehouseOrderId;
		
		@Column
		private int warehouseId;
		
		@Column //Format "YYYY-MM-DD"
		private String orderDate; 
		
		@Column
		private String receivedDate;

		//constructors
		public WarehouseOrder() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		public WarehouseOrder(int warehouseOrderId, int warehouseId, String orderDate, String receivedDate) {
			super();
			this.warehouseOrderId = warehouseOrderId;
			this.warehouseId = warehouseId;
			this.orderDate = orderDate;
			this.receivedDate = receivedDate;
		}

		//getters & setters
		public int getWarehouseOrderId() {
			return warehouseOrderId;
		}

		public void setWarehouseOrderId(int warehouseOrderId) {
			this.warehouseOrderId = warehouseOrderId;
		}

		public int getWarehouseId() {
			return warehouseId;
		}

		public void setWarehouseId(int warehouseId) {
			this.warehouseId = warehouseId;
		}

		public String getOrderDate() {
			return orderDate;
		}

		public void setOrderDate(String orderDate) {
			this.orderDate = orderDate;
		}

		public String getReceivedDate() {
			return receivedDate;
		}

		public void setReceivedDate(String receivedDate) {
			this.receivedDate = receivedDate;
		}
		
		
}
