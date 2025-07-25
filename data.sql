# GOBI DATA INPUT

# insert data into state table
insert into `gobi`.`state`(state_name) Values('CA');
insert into `gobi`.`state`(state_name) Values('CO');
insert into `gobi`.`state`(state_name) Values('IL');
insert into `gobi`.`state`(state_name) Values('GA');
select * from `gobi`.`state`;

# insert data into city table
insert into `gobi`.`city`(city_name, state_id) Values('Roseville', 6);
insert into `gobi`.`city`(city_name, state_id) Values('Boulder', 7);
insert into `gobi`.`city`(city_name, state_id) Values('Chicago', 8);
insert into `gobi`.`city`(city_name, state_id) Values('Atlanta', 9);
SELECT * FROM `gobi`.`city`;

#insert data into warehouse table
insert into `gobi`.`warehouse`(warehouse_id, city_id) Values(563, 4);
insert into `gobi`.`warehouse`(warehouse_id, city_id) Values(119, 5);
insert into `gobi`.`warehouse`(warehouse_id, city_id) Values(256, 6);
insert into `gobi`.`warehouse`(warehouse_id, city_id) Values(398, 7);
SELECT * FROM `gobi`.`warehouse`;

# insert data into warehouse order table (6 records)
insert into `gobi`.`warehouse_order`(warehouse_id, order_date, received_date) Values(563, '2025-07-07', '2025-07-21');
insert into `gobi`.`warehouse_order`(warehouse_id, order_date, received_date) Values(256, '2025-07-05', '2025-07-16');
insert into `gobi`.`warehouse_order`(warehouse_id, order_date, received_date) Values(398, '2025-07-07', '2025-07-21');
insert into `gobi`.`warehouse_order`(warehouse_id, order_date, received_date) Values(119, '2025-07-10', '2025-07-23');
insert into `gobi`.`warehouse_order`(warehouse_id, order_date) Values(119, '2025-06-25');
insert into `gobi`.`warehouse_order`(warehouse_id, order_date) Values(256, '2025-07-24');
select * from `gobi`.`warehouse_order`;

# insert data into product table (100 products)
insert into `gobi`.`product` (product_id, product_name, price) values (2252, 'Kitchen Scale', 19.99);
insert into `gobi`.`product` (product_id, product_name, price) values (9602, 'Pet Bed with Removable Cover', 49.99);
insert into `gobi`.`product` (product_id, product_name, price) values (4068, 'Portable Hammock', 27.99);
insert into `gobi`.`product` (product_id, product_name, price) values (2234, 'Bamboo Cutting Board Set', 34.99);
insert into `gobi`.`product` (product_id, product_name, price) values (9082, 'Portable Solar Phone Charger', 29.99);
insert into `gobi`.`product` (product_id, product_name, price) values (6962, 'Pasta Portion Control Measure', 9.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1501, 'Reusable Silicone Food Storage Bags', 19.99);
insert into `gobi`.`product` (product_id, product_name, price) values (8340, 'Chickpea Salad Deluxe', 4.29);
insert into `gobi`.`product` (product_id, product_name, price) values (3475, 'Cat Tree with Scratching Posts', 79.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1818, 'Vegan Chickpea Salad', 3.99);
insert into `gobi`.`product` (product_id, product_name, price) values (645, 'Pressure Washer Accessories Kit', 39.99);
insert into `gobi`.`product` (product_id, product_name, price) values (6852, 'Chocolate Chip Cookie Dough', 5.49);
insert into `gobi`.`product` (product_id, product_name, price) values (1888, 'Pomegranate Juice', 4.49);
insert into `gobi`.`product` (product_id, product_name, price) values (6132, 'Teriyaki Sauce', 2.99);
insert into `gobi`.`product` (product_id, product_name, price) values (158, 'Mesh Sports Leggings', 39.99);
insert into `gobi`.`product` (product_id, product_name, price) values (3320, 'Electric Griddle', 54.99);
insert into `gobi`.`product` (product_id, product_name, price) values (661, 'Party Mini Dress', 69.99);
insert into `gobi`.`product` (product_id, product_name, price) values (3916, 'Screen Cleaning Kit', 15.99);
insert into `gobi`.`product` (product_id, product_name, price) values (5456, 'Matcha Green Tea Powder', 14.99);
insert into `gobi`.`product` (product_id, product_name, price) values (8449, 'Herbal Garden Starter Kit', 24.99);
insert into `gobi`.`product` (product_id, product_name, price) values (322, 'Almond Crunch Granola Bars', 3.49);
insert into `gobi`.`product` (product_id, product_name, price) values (450, 'Foot Spa Bath Massager', 59.99);
insert into `gobi`.`product` (product_id, product_name, price) values (436, 'Artisan Pickles', 2.49);
insert into `gobi`.`product` (product_id, product_name, price) values (815, 'Smart Plug', 19.99);
insert into `gobi`.`product` (product_id, product_name, price) values (9565, 'Sriracha Hot Chili Sauce', 2.99);
insert into `gobi`.`product` (product_id, product_name, price) values (9674, 'Adjustable Kitchen Broom Stand', 14.99);
insert into `gobi`.`product` (product_id, product_name, price) values (8916, 'Digital Alarm Clock', 19.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1045, 'Travel Yoga Mat', 34.99);
insert into `gobi`.`product` (product_id, product_name, price) values (6308, 'Comfort Flats', 44.99);
insert into `gobi`.`product` (product_id, product_name, price) values (5969, 'Turmeric Ginger Tea', 3.29);
insert into `gobi`.`product` (product_id, product_name, price) values (6650, 'Portable Projector', 199.99);
insert into `gobi`.`product` (product_id, product_name, price) values (4001, 'Portable Blender', 30);
insert into `gobi`.`product` (product_id, product_name, price) values (3379, 'Hummus', 4.29);
insert into `gobi`.`product` (product_id, product_name, price) values (936, 'Sesame Ginger Dressing', 4.09);
insert into `gobi`.`product` (product_id, product_name, price) values (9901, 'Basil Tomato Soup', 2.99);
insert into `gobi`.`product` (product_id, product_name, price) values (7307, 'Sketchbook', 14.99);
insert into `gobi`.`product` (product_id, product_name, price) values (4415, 'Interactive Plush Toy', 34.99);
insert into `gobi`.`product` (product_id, product_name, price) values (8492, 'Egg Noodles', 2.29);
insert into `gobi`.`product` (product_id, product_name, price) values (969, 'Tomato Basil Pasta Sauce', 3.99);
insert into `gobi`.`product` (product_id, product_name, price) values (4080, 'Mini Projector', 169.99);
insert into `gobi`.`product` (product_id, product_name, price) values (5429, 'Cinnamon Roll Protein Bar', 2.99);
insert into `gobi`.`product` (product_id, product_name, price) values (6642, 'Instant Camera', 89.99);
insert into `gobi`.`product` (product_id, product_name, price) values (8949, 'Crispy Onion Rings', 4.29);
insert into `gobi`.`product` (product_id, product_name, price) values (4147, 'Vegetarian Sausage Links', 5.89);
insert into `gobi`.`product` (product_id, product_name, price) values (6572, 'Smart Light Bulbs', 34.99);
insert into `gobi`.`product` (product_id, product_name, price) values (865, 'Zesty Cilantro Lime Dressing', 3.29);
insert into `gobi`.`product` (product_id, product_name, price) values (3751, 'Luxury Rolling Makeup Case', 99.99);
insert into `gobi`.`product` (product_id, product_name, price) values (449, 'Pineapple Coconut Yogurt', 4.49);
insert into `gobi`.`product` (product_id, product_name, price) values (2191, 'Non-Stick Grill Mat', 19.99);
insert into `gobi`.`product` (product_id, product_name, price) values (8398, 'Home Office Chair', 199.99);
insert into `gobi`.`product` (product_id, product_name, price) values (7680, 'Eggs (dozen)', 2.99);
insert into `gobi`.`product` (product_id, product_name, price) values (3543, 'Pepperoni Pizza Roll-Ups', 5.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1276, 'Smartphone Hand Grip', 9.99);
insert into `gobi`.`product` (product_id, product_name, price) values (2913, 'Pistachios', 6.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1526, 'Corn Tortillas', 2.49);
insert into `gobi`.`product` (product_id, product_name, price) values (373, 'Dark Chocolate Covered Raisins', 3.99);
insert into `gobi`.`product` (product_id, product_name, price) values (6138, 'Flavored Rice Cakes', 2.49);
insert into `gobi`.`product` (product_id, product_name, price) values (6323, 'Veggie Burger Patties', 5.99);
insert into `gobi`.`product` (product_id, product_name, price) values (2860, 'Sliced Turkey Breast', 5.49);
insert into `gobi`.`product` (product_id, product_name, price) values (4831, 'Peas (frozen)', 1.89);
insert into `gobi`.`product` (product_id, product_name, price) values (2821, 'Multi-Tool', 39.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1833, 'Bamboo Utensil Set', 14.99);
insert into `gobi`.`product` (product_id, product_name, price) values (3322, 'Organic Black Bean Burger', 4.49);
insert into `gobi`.`product` (product_id, product_name, price) values (8045, 'Car Vacuum', 49.99);
insert into `gobi`.`product` (product_id, product_name, price) values (4296, 'Almond Butter Granola Bars', 4.99);
insert into `gobi`.`product` (product_id, product_name, price) values (7012, 'Spicy Beef Taco Mix', 1.99);
insert into `gobi`.`product` (product_id, product_name, price) values (7197, 'Reusable Coffee Filter', 10.99);
insert into `gobi`.`product` (product_id, product_name, price) values (7593, 'Dish Rack', 24.99);
insert into `gobi`.`product` (product_id, product_name, price) values (3122, 'Adjustable Laptop Desk', 59.99);
insert into `gobi`.`product` (product_id, product_name, price) values (9131, 'Herbal Tea Infuser', 9.99);
insert into `gobi`.`product` (product_id, product_name, price) values (2258, 'Electric Heat Press Machine', 99.99);
insert into `gobi`.`product` (product_id, product_name, price) values (4659, 'Garden Tool Belt', 22.99);
insert into `gobi`.`product` (product_id, product_name, price) values (5237, 'Gardening Gloves', 15.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1877, 'Leather Wallet', 49.99);
insert into `gobi`.`product` (product_id, product_name, price) values (2765, 'Vegetarian Pizza', 5.49);
insert into `gobi`.`product` (product_id, product_name, price) values (956, 'Crafting Kit', 29.99);
insert into `gobi`.`product` (product_id, product_name, price) values (7323, 'Wooden Children''s Play Kitchen', 129.99);
insert into `gobi`.`product` (product_id, product_name, price) values (7679, 'Sun-Dried Tomato Pesto', 4.49);
insert into `gobi`.`product` (product_id, product_name, price) values (6376, 'Pet Reflective Vest', 18.99);
insert into `gobi`.`product` (product_id, product_name, price) values (2012, 'Rustic Italian Breads', 3.99);
insert into `gobi`.`product` (product_id, product_name, price) values (3846, 'Miso Dressing', 3.49);
insert into `gobi`.`product` (product_id, product_name, price) values (3577, 'Spinach and Feta Stuffed Chicken Breast', 8.99);
insert into `gobi`.`product` (product_id, product_name, price) values (4112, 'Toilet Paper (12 rolls)', 8.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1732, 'Gardening Fairy Figurines', 14.99);
insert into `gobi`.`product` (product_id, product_name, price) values (4875, 'Set of Herb Garden Markers', 8.99);
insert into `gobi`.`product` (product_id, product_name, price) values (6822, 'Portable Camping Shower', 39.99);
insert into `gobi`.`product` (product_id, product_name, price) values (333, 'Chocolate Mint Protein Shake', 3.99);
insert into `gobi`.`product` (product_id, product_name, price) values (3679, 'Hand Mixer', 29.99);
insert into `gobi`.`product` (product_id, product_name, price) values (8199, 'Garlic Parmesan Roasted Potatoes', 3.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1524, 'Jennifer''s Amazing Lip Balm Kit', 22.99);
insert into `gobi`.`product` (product_id, product_name, price) values (9819, 'Fitness Mat', 49.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1749, 'Wireless Music Receiver', 19.99);
insert into `gobi`.`product` (product_id, product_name, price) values (3795, 'Heavy Duty Gardening Tool Set', 49.99);
insert into `gobi`.`product` (product_id, product_name, price) values (446, 'High-Waisted Skirt', 34.99);
insert into `gobi`.`product` (product_id, product_name, price) values (8439, 'Balsamic Vinegar', 4.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1764, 'Pet Hair Removal Roller', 10.99);
insert into `gobi`.`product` (product_id, product_name, price) values (8620, 'Rechargeable Hand Warmer', 22.99);
insert into `gobi`.`product` (product_id, product_name, price) values (1733, 'Kids'' Dinosaur-Themed Lunchbox', 19.99);
insert into `gobi`.`product` (product_id, product_name, price) values (416, 'Cauliflower Pizza Crust', 5.99);
insert into `gobi`.`product` (product_id, product_name, price) values (7052, 'Digital Stopwatch Timer', 12.99);

select count(*) as total_count, count(distinct(product_id)) as unique_ids, count(distinct(product_name)) as unique_name from `gobi`.`product`;
select * from `gobi`.`product`;

# insert data into order_product table (50 records)
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 6, 8492, 2);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 4, 1276, 80);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 5, 322, 88);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 4, 9674, 64);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 4, 9602, 64);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 6, 9674, 34);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 6, 1526, 83);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 6, 5237, 41);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 6, 1833, 65);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 5, 2012, 59);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 1, 1733, 74);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 3, 6962, 14);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 4001, 68);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 6572, 91);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 9674, 14);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 4, 2913, 77);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 3, 7323, 47);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 3, 7052, 97);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 645, 37);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 5, 9901, 39);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 5, 1501, 45);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 5, 1888, 96);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 2234, 33);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 5, 1818, 76);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 3, 7197, 79);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 449, 73);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 6650, 93);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 6822, 16);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 6138, 79);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 3, 8916, 2);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 4, 2765, 1);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 3, 815, 51);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 5, 4296, 19);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 1, 9674, 34);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 5, 815, 29);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 6, 6323, 15);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 4, 956, 56);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 661, 59);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 4, 1749, 53);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 1, 4112, 28);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 1, 436, 98);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 1, 3679, 81);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 3, 1764, 91);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 6, 956, 81);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 1, 9082, 87);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 4, 449, 99);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 1, 7197, 14);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 4, 4112, 9);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 3, 6822, 95);
insert into `gobi`.`order_products`(order_id, product_id, qty) Values( 2, 9602, 92);

select * from `gobi`.`order_products`;
select count(*) from `gobi`.`order_products`;

# insert data, at least 20 products total between at least 2 warehouses
# check the records that need to inserted in to the inventory table
select a.warehouse_id, b.*
from `gobi`.`warehouse_order` as a
inner join `gobi`.`order_products` as b
on a.warehouse_order_id = b.order_id
where received_date is not null
order by a.warehouse_id asc;

# check to see if we meet the 20 minimum product requirement | this table has 28 
select count(distinct(product_id)) as unqiue_product_count 
from `gobi`.`warehouse_order` as a
inner join `gobi`.`order_products` as b
on a.warehouse_order_id = b.order_id
where received_date is not null
order by a.warehouse_id asc;

# insert 35 records to warehouse_inventory table
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 436, 98, 'NY77', 15, 88 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 449, 148, 'BM44', 96, 173 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 449, 90, 'SM94', 43, 105 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 645, 85, 'XF8', 80, 107 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 661, 116, 'XN91', 15, 206 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 815, 109, 'EH76', 39, 199 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 956, 66, 'ON99', 24, 172 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 1276, 155, 'FY12', 75, 187 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 1733, 161, 'RY16', 19, 187 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 1749, 64, 'SK35', 45, 67 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 1764, 120, 'NG48', 38, 227 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 2234, 198, 'OM15', 53, 207 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 2765, 17, 'PD37', 25, 66 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 2913, 78, 'BH57', 48, 193 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 3679, 85, 'JN34', 76, 133 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 4001, 73, 'SB76', 78, 83 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 4112, 39, 'YR40', 29, 71 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 4112, 36, 'LW71', 19, 71 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 6138, 94, 'LY56', 91, 158 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 6572, 130, 'OM79', 4, 183 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 6650, 173, 'KP17', 11, 196 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 6822, 135, 'TB58', 98, 197 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 6822, 155, 'ZB15', 73, 197 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 6962, 224, 'LB99', 40, 231 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 7052, 164, 'GL20', 56, 230 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 7197, 79, 'PT42', 36, 76 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 7197, 20, 'NL13', 76, 198 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 7323, 67, 'UE36', 87, 244 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 8916, 34, 'EG32', 81, 88 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 9082, 89, 'YI45', 9, 128 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 9602, 73, 'FD8', 53, 81 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 9602, 95, 'PL12', 93, 108 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 9674, 80, 'GF90', 7, 94 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 9674, 142, 'DL72', 13, 174 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 9674, 62, 'LZ62', 3, 156 );

select count(*) from `gobi`.`warehouse_inventory` ;

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
select * from `gobi`.`warehouse_inventory` where warehouse_id = 563 order by product_min_qty asc;

# check out the order sorted by order date
select *
from `gobi`.`warehouse_order`
order by order_date desc;

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
on c.product_id = d.product_id;

# what's the most expensive item in our product table?
select * from `gobi`.`product` order by price desc;
