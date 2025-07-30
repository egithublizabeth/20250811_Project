#########################
### GOBI DATA INPUT #####
#########################

################################################
# insert data into state table (table 1 of 7)
################################################
INSERT INTO `gobi`.`state`(state_name) VALUES('CA');
INSERT INTO `gobi`.`state`(state_name) VALUES('CO');
INSERT INTO `gobi`.`state`(state_name) VALUES('IL');
INSERT INTO `gobi`.`state`(state_name) VALUES('GA');

################################################
# insert data into city table (table 2 of 7)
################################################
INSERT INTO `gobi`.`city`(city_name, state_id) VALUES('Roseville', 1);
INSERT INTO `gobi`.`city`(city_name, state_id) VALUES('Boulder', 2);
INSERT INTO `gobi`.`city`(city_name, state_id) VALUES('Chicago', 3);
INSERT INTO `gobi`.`city`(city_name, state_id) VALUES('Atlanta', 4);

################################################
#insert data into warehouse table (table 3 of 7)
################################################
INSERT INTO `gobi`.`warehouse`(warehouse_id, city_id) VALUES(563, 1);
INSERT INTO `gobi`.`warehouse`(warehouse_id, city_id) VALUES(119, 2);
INSERT INTO `gobi`.`warehouse`(warehouse_id, city_id) VALUES(256, 3);
INSERT INTO `gobi`.`warehouse`(warehouse_id, city_id) VALUES(398, 4);

#####################################################################
# insert 8 data records into warehouse_order table (table 4 of 7)
#####################################################################
# warehouse_id = 563
INSERT INTO `gobi`.`warehouse_order`(warehouse_order_id, warehouse_id, order_date, received_date) VALUES(1, 563, '2025-07-07', '2025-07-21');

# warehouse_id = 398
INSERT INTO `gobi`.`warehouse_order`(warehouse_order_id, warehouse_id, order_date, received_date) VALUES(3, 398, '2025-07-07', '2025-07-21');

# warehouse_id = 119
INSERT INTO `gobi`.`warehouse_order`(warehouse_order_id, warehouse_id, order_date, received_date) VALUES(4, 119, '2025-07-10', '2025-07-23');
INSERT INTO `gobi`.`warehouse_order`(warehouse_order_id, warehouse_id, order_date, received_date) VALUES(8, 119, '2025-05-28', '2025-06-12');
INSERT INTO `gobi`.`warehouse_order`(warehouse_order_id, warehouse_id, order_date) VALUES(5, 119, '2025-06-25');

# warehouse_id = 256
INSERT INTO `gobi`.`warehouse_order`(warehouse_order_id, warehouse_id, order_date, received_date) VALUES(2, 256, '2025-07-05', '2025-07-16');
INSERT INTO `gobi`.`warehouse_order`(warehouse_order_id, warehouse_id, order_date, received_date) VALUES(7, 256, '2025-06-27', '2025-07-08');
INSERT INTO `gobi`.`warehouse_order`(warehouse_order_id, warehouse_id, order_date) VALUES(6, 256, '2025-07-24');

############################################################
# insert 100 data records into product table (table 5 of 7)
############################################################
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (2252, 'Kitchen Scale', 19.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (9602, 'Pet Bed with Removable Cover', 49.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (4068, 'Portable Hammock', 27.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (2234, 'Bamboo Cutting Board Set', 34.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (9082, 'Portable Solar Phone Charger', 29.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6962, 'Pasta Portion Control Measure', 9.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1501, 'Reusable Silicone Food Storage Bags', 19.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (8340, 'Chickpea Salad Deluxe', 4.29);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3475, 'Cat Tree with Scratching Posts', 79.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1818, 'Vegan Chickpea Salad', 3.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (645, 'Pressure Washer Accessories Kit', 39.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6852, 'Chocolate Chip Cookie Dough', 5.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1888, 'Pomegranate Juice', 4.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6132, 'Teriyaki Sauce', 2.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (158, 'Mesh Sports Leggings', 39.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3320, 'Electric Griddle', 54.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (661, 'Party Mini Dress', 69.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3916, 'Screen Cleaning Kit', 15.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (5456, 'Matcha Green Tea Powder', 14.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (8449, 'Herbal Garden Starter Kit', 24.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (322, 'Almond Crunch Granola Bars', 3.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (450, 'Foot Spa Bath Massager', 59.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (436, 'Artisan Pickles', 2.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (815, 'Smart Plug', 19.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (9565, 'Sriracha Hot Chili Sauce', 2.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (9674, 'Adjustable Kitchen Broom Stand', 14.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (8916, 'Digital Alarm Clock', 19.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1045, 'Travel Yoga Mat', 34.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6308, 'Comfort Flats', 44.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (5969, 'Turmeric Ginger Tea', 3.29);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6650, 'Portable Projector', 199.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (4001, 'Portable Blender', 30);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3379, 'Hummus', 4.29);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (936, 'Sesame Ginger Dressing', 4.09);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (9901, 'Basil Tomato Soup', 2.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (7307, 'Sketchbook', 14.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (4415, 'Interactive Plush Toy', 34.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (8492, 'Egg Noodles', 2.29);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (969, 'Tomato Basil Pasta Sauce', 3.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (4080, 'Mini Projector', 169.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (5429, 'Cinnamon Roll Protein Bar', 2.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6642, 'Instant Camera', 89.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (8949, 'Crispy Onion Rings', 4.29);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (4147, 'Vegetarian Sausage Links', 5.89);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6572, 'Smart Light Bulbs', 34.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (865, 'Zesty Cilantro Lime Dressing', 3.29);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3751, 'Luxury Rolling Makeup Case', 99.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (449, 'Pineapple Coconut Yogurt', 4.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (2191, 'Non-Stick Grill Mat', 19.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (8398, 'Home Office Chair', 199.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (7680, 'Eggs (dozen)', 2.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3543, 'Pepperoni Pizza Roll-Ups', 5.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1276, 'Smartphone Hand Grip', 9.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (2913, 'Pistachios', 6.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1526, 'Corn Tortillas', 2.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (373, 'Dark Chocolate Covered Raisins', 3.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6138, 'Flavored Rice Cakes', 2.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6323, 'Veggie Burger Patties', 5.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (2860, 'Sliced Turkey Breast', 5.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (4831, 'Peas (frozen)', 1.89);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (2821, 'Multi-Tool', 39.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1833, 'Bamboo Utensil Set', 14.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3322, 'Organic Black Bean Burger', 4.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (8045, 'Car Vacuum', 49.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (4296, 'Almond Butter Granola Bars', 4.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (7012, 'Spicy Beef Taco Mix', 1.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (7197, 'Reusable Coffee Filter', 10.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (7593, 'Dish Rack', 24.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3122, 'Adjustable Laptop Desk', 59.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (9131, 'Herbal Tea Infuser', 9.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (2258, 'Electric Heat Press Machine', 99.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (4659, 'Garden Tool Belt', 22.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (5237, 'Gardening Gloves', 15.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1877, 'Leather Wallet', 49.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (2765, 'Vegetarian Pizza', 5.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (956, 'Crafting Kit', 29.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (7323, 'Wooden Children''s Play Kitchen', 129.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (7679, 'Sun-Dried Tomato Pesto', 4.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6376, 'Pet Reflective Vest', 18.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (2012, 'Rustic Italian Breads', 3.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3846, 'Miso Dressing', 3.49);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3577, 'Spinach and Feta Stuffed Chicken Breast', 8.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (4112, 'Toilet Paper (12 rolls)', 8.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1732, 'Gardening Fairy Figurines', 14.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (4875, 'Set of Herb Garden Markers', 8.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (6822, 'Portable Camping Shower', 39.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (333, 'Chocolate Mint Protein Shake', 3.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3679, 'Hand Mixer', 29.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (8199, 'Garlic Parmesan Roasted Potatoes', 3.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1524, 'Jennifer''s Amazing Lip Balm Kit', 22.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (9819, 'Fitness Mat', 49.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1749, 'Wireless Music Receiver', 19.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (3795, 'Heavy Duty Gardening Tool Set', 49.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (446, 'High-Waisted Skirt', 34.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (8439, 'Balsamic Vinegar', 4.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1764, 'Pet Hair Removal Roller', 10.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (8620, 'Rechargeable Hand Warmer', 22.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (1733, 'Kids'' Dinosaur-Themed Lunchbox', 19.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (416, 'Cauliflower Pizza Crust', 5.99);
INSERT INTO `gobi`.`product` (product_id, product_name, price) VALUES (7052, 'Digital Stopwatch Timer', 12.99);


##################################################################
# insert 66 data records into order_products table (table 6 of 7)
##################################################################
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 1, 436, 98);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 1, 1733, 74);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 1, 3679, 81);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 1, 4112, 28);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 1, 7197, 14);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 1, 9082, 87);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 1, 9674, 34);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 449, 73);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 645, 37);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 661, 59);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 2234, 33);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 4001, 68);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 6138, 79);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 6572, 91);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 6650, 93);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 6822, 16);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 9602, 92);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 2, 9674, 14);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 3, 815, 51);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 3, 1764, 91);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 3, 6822, 95);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 3, 6962, 14);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 3, 7052, 97);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 3, 7197, 79);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 3, 7323, 47);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 3, 8916, 2);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 4, 449, 99);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 4, 956, 56);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 4, 1276, 80);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 4, 1749, 53);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 4, 2765, 1);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 4, 2913, 77);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 4, 4112, 9);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 4, 9602, 64);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 4, 9674, 64);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 5, 322, 88);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 5, 815, 29);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 5, 1501, 45);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 5, 1818, 76);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 5, 1888, 96);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 5, 2012, 59);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 5, 4296, 19);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 5, 9901, 39);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 6, 956, 81);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 6, 1526, 83);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 6, 1833, 65);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 6, 5237, 41);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 6, 6323, 15);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 6, 8492, 2);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 6, 9674, 34);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 7, 956, 41);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 7, 1526, 47);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 7, 1833, 77);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 7, 5237, 89);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 7, 6323, 72);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 7, 7052, 72);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 7, 8398, 94);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 8, 322, 46);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 8, 815, 85);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 8, 1501, 67);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 8, 2012, 92);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 8, 2252, 92);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 8, 3379, 50);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 8, 5429, 56);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 8, 6650, 42);
INSERT INTO `gobi`.`order_products`(order_id, product_id, qty) VALUES( 8, 6822, 29);

#####################################################################
# insert 51 data records to warehouse_inventory table (table 7 of 7)
#####################################################################
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 436, 97, 'AI70', 13, 81 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 1733, 23, 'ET39', 34, 82 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 3679, 57, 'WN12', 38, 88 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 4112, 40, 'UA42', 30, 80 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 7197, 43, 'UA30', 27, 85 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 9082, 72, 'UA53', 45, 64 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 563, 9674, 53, 'KE22', 24, 61 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 449, 72, 'KE65', 6, 64 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 645, 77, 'EK14', 31, 90 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 661, 29, 'AC23', 16, 51 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 2234, 39, 'AM81', 40, 94 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 4001, 33, 'SA72', 21, 53 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 6138, 52, 'AZ60', 32, 98 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 6572, 30, 'AM78', 18, 97 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 6650, 96, 'TG62', 35, 77 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 6822, 90, 'AF66', 29, 74 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 9602, 9, 'CX93', 24, 89 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 9674, 30, 'AV11', 31, 77 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 815, 66, 'QR48', 8, 61 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 1764, 84, 'SK78', 33, 82 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 6822, 65, 'AV94', 33, 81 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 6962, 23, 'NZ16', 11, 78 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 7052, 74, 'TG42', 15, 51 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 7197, 39, 'EK45', 35, 62 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 7323, 63, 'NZ94', 20, 91 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 398, 8916, 2, 'AA13', 16, 49 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 449, 75, 'AV80', 12, 83 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 956, 98, 'AV34', 9, 81 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 1276, 14, 'AI31', 47, 79 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 1749, 90, 'AA26', 14, 93 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 2765, 45, 'QF48', 24, 92 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 2913, 50, 'TG67', 37, 60 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 4112, 63, 'EK88', 38, 61 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 9602, 73, 'LA11', 23, 57 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 9674, 63, 'NH39', 12, 95 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 956, 22, 'DL51', 20, 56 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 1526, 33, 'SQ35', 7, 90 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 1833, 47, 'IB48', 31, 71 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 5237, 15, 'SK72', 15, 55 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 6323, 56, 'AI98', 49, 69 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 7052, 70, 'BA97', 11, 89 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 256, 8398, 85, 'AZ78', 19, 76 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 322, 33, 'LA72', 26, 82 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 815, 80, 'SA95', 16, 73 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 1501, 50, 'AM66', 30, 71 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 2012, 90, 'EK52', 21, 86 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 2252, 2, 'CX45', 11, 57 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 3379, 9, 'UA97', 49, 69 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 5429, 29, 'EK39', 36, 67 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 6650, 15, 'DL94', 36, 91 );
insert into `gobi`.`warehouse_inventory`(warehouse_id, product_id, product_qty, product_location, product_min_qty, product_max_qty) Values( 119, 6822, 12, 'TG94', 47, 71 );
