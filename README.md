# Inventory Management API Project

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

