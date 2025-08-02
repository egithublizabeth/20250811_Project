# GOBI DATABASE

# TABLES
-- state
-- city
-- warehouse 
-- warehouse_inventory
-- warehouse_order
-- order_products
-- product

# RELATIONSHIPS
-- state-to-city = 1 to many(FK)
-- warehouse-to-city = 1 to many(FK)
-- warehouse_inventory-to-warehouse = many to many with composit key (warehouse_id & product_id)
-- warehouse-to-warehouse_order = 1 to many(FK)
-- orders-to-product = many to many (composite key in order_products table)

#create database
CREATE SCHEMA `gobi`;

# create state table: store state information
CREATE TABLE `gobi`.`state` 
(
  `state_id` INT NOT NULL AUTO_INCREMENT,
  `state_name` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`state_id`)
  );

# create city table: store city information
CREATE TABLE `gobi`.`city`
 (
  `city_id` INT NOT NULL AUTO_INCREMENT,
  `city_name` VARCHAR(100) NOT NULL,
  `state_id` INT NOT NULL,
  PRIMARY KEY (`city_id`),
  INDEX `state_id1_idx` (`state_id` ASC) VISIBLE,
  CONSTRAINT `state_id1`
    FOREIGN KEY (`state_id`)
    REFERENCES `gobi`.`state` (`state_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
    );

# create warehouse table: store warehouse information
CREATE TABLE `gobi`.`warehouse` 
(
  `warehouse_id` INT NOT NULL,
  `city_id` INT NOT NULL,
  PRIMARY KEY (`warehouse_id`),
  INDEX `city_id1_idx` (`city_id` ASC) VISIBLE,
  CONSTRAINT `city_id1`
    FOREIGN KEY (`city_id`)
    REFERENCES `gobi`.`city` (`city_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE
);

# create warehouse_order table: store warehouses' orders for 'warehouse fufillment'
CREATE TABLE `gobi`.`warehouse_order` (
  `warehouse_order_id` INT NOT NULL,
  `warehouse_id` INT NOT NULL,
  `order_date` DATE NOT NULL,
  `received_date` DATE NULL,
  PRIMARY KEY (`warehouse_order_id`),
  INDEX `warehouse_id1_idx` (`warehouse_id` ASC) VISIBLE,
  CONSTRAINT `warehouse_id1`
    FOREIGN KEY (`warehouse_id`)
    REFERENCES `gobi`.`warehouse` (`warehouse_id`)
    ON DELETE NO ACTION
    ON UPDATE CASCADE);
    
# create product table: store product information
CREATE TABLE `gobi`.`product` (
  `product_id` INT NOT NULL,
  `product_name` VARCHAR(100) NOT NULL,
  `price` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`product_id`));
  
# create order_products table: store every product linked to an order, table holds multiple orders
CREATE TABLE `gobi`.`order_products` (
  `order_id` INT NOT NULL,
  `product_id` INT NOT NULL,
  `qty` INT NOT NULL,
  PRIMARY KEY (`order_id`, `product_id`),
  INDEX `product_id1_idx` (`product_id` ASC) VISIBLE,
  CONSTRAINT `order_id1`
    FOREIGN KEY (`order_id`)
    REFERENCES `gobi`.`warehouse_order` (`warehouse_order_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `product_id1`
    FOREIGN KEY (`product_id`)
    REFERENCES `gobi`.`product` (`product_id`)
    ON DELETE NO ACTION 
    ON UPDATE CASCADE);

# create warehouse_inventory table: for every warehouse, store it's inventory
CREATE TABLE `gobi`.`warehouse_inventory` 
(
  `warehouse_id` INT NOT NULL,
  `product_id` INT NOT NULL,
  `product_qty` INT NULL,
  `product_location` VARCHAR(100) NULL,
  `product_min_qty` INT NULL,
  `product_max_qty` INT NULL,
  PRIMARY KEY (`warehouse_id`, `product_id`),
  INDEX `warehouse_id1_idx` (`warehouse_id` ASC) VISIBLE,
  CONSTRAINT `warehouse_id2`
    FOREIGN KEY (`warehouse_id`)
    REFERENCES `gobi`.`warehouse` (`warehouse_id`)
    ON DELETE CASCADE
    ON UPDATE CASCADE,
  CONSTRAINT `product_id2`
	  FOREIGN KEY (`product_id`)
	  REFERENCES `gobi`.`product` (`product_id`)
	  ON DELETE RESTRICT 
	  ON UPDATE CASCADE
);



