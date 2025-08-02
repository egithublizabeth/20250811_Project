####################################################################
### Sanity Checks Post Table Record Insertion ######################
####################################################################

# select * from `gobi`.`state`;

# SELECT * FROM `gobi`.`city`;

SELECT * FROM `gobi`.`warehouse`; 

# select * from `gobi`.`warehouse_order`;

# select count(*) as total_count, 
# count(distinct(product_id)) as unique_ids, 
# count(distinct(product_name)) as unique_name 
# from `gobi`.`product`;

# select * from `gobi`.`product` limit 5;

# select * from `gobi`.`order_products` limit 10;
# select count(*) from `gobi`.`order_products`;

# insert data, requirement: at least 20 products total between at least 2 warehouses
# check the non-null received_date records that need to inserted in to the inventory table
# SELECT a.warehouse_id, b.*
# FROM `gobi`.`warehouse_order` AS a
# INNER JOIN `gobi`.`order_products` AS b
# ON a.warehouse_order_id = b.order_id
# WHERE received_date IS NOT NULL
# ORDER BY a.warehouse_id ASC;


# SELECT COUNT(*) FROM `gobi`.`warehouse_inventory` ;

# check to see if we meet the 20 minimum unique product requirement | this table has 39
# SELECT COUNT(DISTINCT(product_id)) AS unique_product_count FROM `gobi`.`warehouse_inventory`;

################################
### SQL Queries ###############
################################

# where are our warehouses located?
select a.warehouse_id, b.city_name, c.state_name
from `gobi`.`warehouse` as a
join `gobi`.`city` as b
	on a.city_id = b.city_id
join `gobi`.`state` as c
	on b.state_id = c.state_id;

# check out this warehouse inventory
SELECT * FROM `gobi`.`warehouse_inventory` WHERE warehouse_id = 563 ORDER BY product_min_qty ASC;

# check out the order, sorted by order date
SELECT *
FROM `gobi`.`warehouse_order`
ORDER BY order_date DESC;

# check out the products from the non-received order from 2025-06-25 order_id = 5
with order_to_product as
(
	select *
	from `gobi`.`warehouse_order` as a
	inner join  `gobi`.`order_products` as b
	on  a.warehouse_order_id = b.order_id
	where a.warehouse_order_id = 5
)
select c.product_id, c.qty, d.product_name, d.price
from order_to_product as c
inner join `gobi`.`product` as d
on c.product_id = d.product_id
order by price desc;

# what's the most expensive item in our product table?
SELECT * FROM `gobi`.`product` ORDER BY price DESC limit 5;

# Bug 1 and 2 checks
# bug 1: check if every order_id in the order_products table is only associated to 1 warehouse-Id
select warehouse_order_id, count(distinct(warehouse_id)) as warehouse_count
from `gobi`.`warehouse_order`
group by warehouse_order_id;

# bug 2: check if every product_id in warehouse_inventory had a valid order_id and each order_id is only associated to 1 warehouse
SELECT a.product_id, a.warehouse_id, b.warehouse_order_id, b.order_date, b.received_date
FROM `gobi`.`warehouse_inventory`  as a
inner join `gobi`.`warehouse_order` as b
on a.warehouse_id = b.warehouse_id
where product_id = 9674 
order by warehouse_id desc, b.received_date desc;

################################
### REST API Endpoint Testing ##
################################

# Delete all records in product table to (can't drop b/c it's a FK in another table)
## test retrieve all products in Product table Error response (empty object) | 404 Not Found
## test delete by product id | 204 No content
set sql_safe_updates = 0;
delete from `gobi`.`product`; 
set sql_safe_updates = 1;

select * from `gobi`.`product`;
select count(*) from `gobi`.`product`;

# Drop Warehouse Inventory Table & re-created to test the Error Response (empty object) | 404 Not Found
select * 
from `gobi`.`warehouse_inventory`
where warehouse_id = 119 and product_id = 322;

SELECT * FROM `gobi`.`warehouse_inventory` where warehouse_id = 398;