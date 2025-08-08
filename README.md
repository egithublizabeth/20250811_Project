# Inventory Management API Project

### **Project Objective** 
Create an inventory management solution that will enable an administrator at a given company to manage the entities at any of its warehouses. The administrator should possess the ability to view, add, remove, and alter any of the entities within that company’s warehouses. Your web-based API should provide appropriate, well documented endpoints for each operation.

The application should also take into consideration possible edge cases such as a warehouse having a maximum capacity and handling the addition of items that would cause the warehouse to exceed its capacity.

------------------------------------

### **Project Requirements**  
Functional Requirements:
- Must be a backend application consisting of:
  - Java Spring Boot REST API
  - MySQL Database
- Code should be available in a public GitHub repository
- Include a schema.sql file to recreate your database and a data.sql file with at least 2 warehouses and 20 products
- Possesses all required CRUD functionality
- Handles edge cases effectively

Non-Functional Requirements:
- Well-documented code
- Well-documented API endpoints
- Code upholds industry best practices (SOLID/DRY)
- Database is normalized

-------------------------------------

### **Contents in Github Repository**  

- InventoryManagementAPI
   - Folder containing all Java Spring Boot files
- ERR_Diagram_20250725.png
   - Image of Entitiy Relationship Diagram
- Inventory Management API.postman_collection.json
   - JSON file of REST API Endpoints in Postman
- schema.sql
   - mysql file of gobi schema (includes tables)
- data.sql
   - mysql file of data insertion into each table in the gobi schema
- test_queries.sql
   - mysql file for mysql queries sanity checks
- README.md

------------------------------------

### **Gobi Company**  

This is a fuax company, it rivals Amazon as a shopping platform. This Inventory Management System is based off of re-stocking a warehouse's stock, its main client is a warehouse, not a customer making a purchase from Gobi.


<hr>

<!-- Beginning of gobi ER image    -->

### **Gobi Entity Relationship(ER) Diagram**

<details>
<summary>Click Here to See Image | Legend: Crows Feet = Many & 2 Ticks = One </summary>
<img alt="ERR_Diagram_20250725.png" src="https://github.com/egithublizabeth/20250811_Project/blob/main/ERR_Diagram_20250725.png?raw=true" data-hpc="true" class="Box-sc-g0xbh4-0 fzFXnm">
</details>

<!-- End of gobi ER image    -->

<hr>


### **Gobi Edge Cases**  

A Gobi warehouse product quantity can be below zero or it's set minimum threshold and it can also be greater than it's set maximum capacity.

*Below zero or set minimum threshold*:
  - Triggers the Price Department to review selling cost of the product.
      - Increase Selling Cost, Decrease Quantity Sold
   
  - Local Market Buying Habits i.e Market 'A' prefers item 'X' more than Market 'B'


*Above set maximum threshold*:
  - Triggers the Price Department to review selling cost of the product.
    - Decrease Selling Cost, Increase Quantity Sold
   
  - Local Market Buying Habits i.e Market 'A' prefers item 'X' less than Market 'B'
------------------------------------

<!-- Begining of Required Endpoints -->
### **Required Endpoints**  
7 Endpoints
  + <details>
      <summary>GET/warehouses</summary>
      &emsp;Objective: See every warehouses' inventory<br>
      &emsp;Input(s): n/a<br>
      &emsp;Output(s): Returns all warehouses' inventory <br>
      &emsp;Table(s): warehouse_inventory
    </details>

  + <details>
    <summary>GET/warehouses/{id}</summary>
    &emsp;Objective: See every a warehouse's inventory<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;warehouse id -> url parameter <br>
    &emsp;Output(s): Returns all inventory from a warehouse <br>
    &emsp;Table(s): warehouse_inventory
  </details>
  
  + <details>
    <summary>GET/products</summary>
    &emsp;Objective: See all available products<br>
    &emsp;Input(s): n/a <br>
    &emsp;Output(s): Returns all products<br>
    &emsp;Table(s): product
  </details>
  
  + <details>
    <summary>GET/products/{id}</summary>
    &emsp;Objective: See information on a particular product <br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;product id -> url parameter <br>
    &emsp;Output(s): Returns a product record <br>
    &emsp;Table(s): product
  </details>
  
  + <details>
    <summary>POST/proudcts</summary>
    &emsp;Objective: Create a new product record and insert into product table<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;product id -> response body <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;product name -> response body <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;price -> response body <br>
    &emsp;Output(s): n/a <br>
    &emsp;Table(s): product
  </details>
  
  + <details>
    <summary>PUT/products/{id}</summary>
    &emsp;Objective: Update a product record<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;product id -> url parameter <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;(optional) product id -> response body <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;product name -> response body <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;price -> response body <br>
    &emsp;Output(s): n/a<br>
    &emsp;Table(s): product
  </details>
  
  + <details>
    <summary>DELETE/products/{id}</summary>
    &emsp;Objective: Delete a product record<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;product id -> url parameter <br>
    &emsp;Output(s): n/a <br>
    &emsp;Table(s): product
  </details>
<!-- End of Required Endpoints -->

<hr>

<!-- Begining of Extra Endpoints -->
### **Extra Endpoints**
18 Endpoints
  + <details>
      <summary>GET/products/limit/{value}</summary>
      &emsp;Objective: See a limited number of product record(s) <br>
      &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp; integer value -> url parameter <br>
      &emsp;Output(s): Returns "value" number of product record(s) <br>
      &emsp;Table(s): product
    </details>

  + <details>
    <summary>GET/warehouses/{id}/product/{id}</summary>
    &emsp;Objective: See a warehouse_inventory based on warehouse id and product id<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;warehouse id -> url parameter <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;product id -> url parameter <br>
    &emsp;Output(s): Returns a record from warehouse_inventory table<br>
    &emsp;Table(s): warehouse_inventory
  </details>
  
  + <details>
    <summary>GET/warehouses/{id}/product-below-threshold/{value}</summary>
    &emsp;Objective: See all records for a given warehouse where product quantity is lower than the minimum threshold or <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;falls within the value range (positive & negative) from the minimum threshold<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;warehouse id -> url parameter <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;integer value -> url parameter <br>
    &emsp;Output(s): Returns all products for a warehouse where product quantity is less than minimum threshold and <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;within minimum range (value +- minimum number)<br>
    &emsp;Table(s): warehouse_inventory
  </details>
  
  + <details>
    <summary>GET/warehouses/{id}/product-above-threshold/{value}</summary>
    &emsp;Objective: See all records for a given warehouse where product quantity is greater than the maximum threshold or <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;falls within the value range (positive & negative) from the maximum threshold<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;warehouse id -> url parameter <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;integer value -> url parameter <br>
    &emsp;Output(s): Returns all products for a warehouse where product quantity is greater than maximum threshold and <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;&emsp;within minimum range (value +- maximum number)<br>
    &emsp;Table(s): warehouse_inventory
  </details>
  
  + <details>
    <summary>GET/warehouses/{id}/max-product-price-desc/{value}</summary>
    &emsp;Objective: See the top "value"(number i.e 5) most expensive products within a warehouse <br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;warehouse id -> url parameter <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;integer value -> url parameter <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;price -> response body <br>
    &emsp;Output(s): Returns the highest priced "value"(number i.e 5) items from a warehouse <br>
    &emsp;Table(s): warehouse_inventory
  </details>
  
  + <details>
    <summary>GET/warehouses/{id}/min-product-price-asc/{value}</summary>
    &emsp;Objective: See the top "value"(number i.e 5) cheapest products within a warehouse <br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;warehouse id -> url parameter <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;integer value -> url parameter <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;price -> response body <br>
    &emsp;Output(s): Returns the lowest priced "value"(number i.e 5) items from a warehouse <br>
    &emsp;Table(s): warehouse_inventory
  </details>
  
  + <details>
    <summary>GET/warehouses-orders</summary>
    &emsp;Objective: See all records from warehouse_order table<br>
    &emsp;Input(s): n/a <br>
    &emsp;Output(s): Returns all records from warehouse_order table  <br>
    &emsp;Table(s): warehouse_order
  </details>

  + <details>
    <summary>GET/warehouses-orders/order-id/{id}</summary>
    &emsp;Objective: See the record associated to an order id<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;order id -> url parameter <br>
    &emsp;Output(s): Returns a record with the given order id  <br>
    &emsp;Table(s): warehouse_order
  </details>

  + <details>
    <summary>GET/warehouses-orders/warehouse-id/{id}</summary>
    &emsp;Objective: See all order records associated to a warehouse id<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;warehouse id -> url parameter <br>
    &emsp;Output(s): Returns all records associated to a warehouse id <br>
    &emsp;Table(s): warehouse_order
  </details>

  + <details>
    <summary>GET/order-products</summary>
    &emsp;Objective: See all records from order_products table<br>
    &emsp;Input(s): n/a <br>
    &emsp;Output(s): Returns all records from order_products table <br>
    &emsp;Table(s): order_products
  </details>

  + <details>
    <summary>GET/order-products/order-id/{id}</summary>
    &emsp;Objective: See all records associated with a given order id<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;order id -> url parameter <br>
    &emsp;Output(s): Returns all records from an order id <br>
    &emsp;Table(s): order_products
  </details>

  + <details>
    <summary>GET/order-products/product-id/{id}</summary>
    &emsp;Objective: See all records associated with a given product id<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;product id -> url parameter <br>
    &emsp;Output(s): Returns all records from an product id <br>
    &emsp;Table(s): order_products
  </details>
  
  + <details>
    <summary>GET/warehouses-info</summary>
    &emsp;Objective: See all warehouse information records from warehouse table<br>
    &emsp;Input(s): n/a <br>
    &emsp;Output(s): Returns all records from warehouse table <br>
    &emsp;Table(s): warehouse
  </details>

  + <details>
    <summary>GET/warehouses-info/{id}</summary>
    &emsp;Objective: See a record for a particular warehouse<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;warehouse id -> url parameter <br>
    &emsp;Output(s): Returns a record related to a warehouse id <br>
    &emsp;Table(s): warehouse
  </details>

  + <details>
    <summary>GET/states</summary>
    &emsp;Objective: See all records from state table<br>
    &emsp;Input(s): n/a <br>
    &emsp;Output(s): Returns all records from state table <br>
    &emsp;Table(s): state
  </details>

  + <details>
    <summary>GET/states/{id}</summary>
    &emsp;Objective: See a record for a particular state<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;state id -> url parameter <br>
    &emsp;Output(s): Returns a record related to a state id <br>
    &emsp;Table(s): state
  </details>

  + <details>
    <summary>GET/city</summary>
    &emsp;Objective: See all records from city table<br>
    &emsp;Input(s): n/a <br>
    &emsp;Output(s): Returns all records from city table <br>
    &emsp;Table(s): city
  </details>

  + <details>
    <summary>GET/city/{id}</summary>
    &emsp;Objective: See a record for a particular city<br>
    &emsp;Input(s): parameter -> location <br>
    &emsp;&emsp;&emsp;&emsp;&emsp;city id -> url parameter <br>
    &emsp;Output(s): Returns a record related to a city id <br>
    &emsp;Table(s): city
  </details>
<!-- End of Extra Endpoints -->

<hr>



