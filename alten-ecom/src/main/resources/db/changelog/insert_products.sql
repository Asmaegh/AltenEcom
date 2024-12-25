CREATE SEQUENCE PRODUCT_SEQ START WITH 1 INCREMENT BY 1;

INSERT INTO product (id, code, name, description, image, category, price, quantity, internal_reference, shell_id, inventory_status, rating, created_at, created_by, updated_at, updated_by)
VALUES (1, 'GR001', 'Organic Apples', 'Fresh organic red apples, perfect for snacking or baking.', 'organic_apples.jpg', 'Groceries', 3.99, 150, 'GRN001', 1, 'INSTOCK', 4, '2024-12-22 10:00:00', 'admin', '2024-12-22 10:00:00', 'admin');

INSERT INTO product (id, code, name, description, image, category, price, quantity, internal_reference, shell_id, inventory_status, rating, created_at, created_by, updated_at, updated_by)
VALUES (2, 'GR002', 'Bananas', 'Ripe and sweet bananas, great for breakfast or smoothies.', 'bananas.jpg', 'Groceries', 1.49, 120, 'GRN002', 1, 'INSTOCK', 5, '2024-12-22 10:00:00', 'admin', '2024-12-22 10:00:00', 'admin');

INSERT INTO product (id, code, name, description, image, category, price, quantity, internal_reference, shell_id, inventory_status, rating, created_at, created_by, updated_at, updated_by)
VALUES (3, 'GR003', 'Whole Wheat Bread', 'Freshly baked whole wheat bread, high in fiber.', 'whole_wheat_bread.jpg', 'Groceries', 2.99, 80, 'GRN003', 1, 'INSTOCK', 4, '2024-12-22 10:00:00', 'admin', '2024-12-22 10:00:00', 'admin');

INSERT INTO product (id, code, name, description, image, category, price, quantity, internal_reference, shell_id, inventory_status, rating, created_at, created_by, updated_at, updated_by)
VALUES (4, 'GR004', 'Milk', '1-liter carton of fresh whole milk, perfect for coffee, cereals, or baking.', 'milk.jpg', 'Groceries', 1.89, 200, 'GRN004', 2, 'INSTOCK', 5, '2024-12-22 10:00:00', 'admin', '2024-12-22 10:00:00', 'admin');

INSERT INTO product (id, code, name, description, image, category, price, quantity, internal_reference, shell_id, inventory_status, rating, created_at, created_by, updated_at, updated_by)
VALUES (5, 'GR005', 'Eggs (Dozen)', 'Grade A large eggs, 12 count, ideal for breakfast or cooking.', 'eggs.jpg', 'Groceries', 2.99, 150, 'GRN005', 2, 'INSTOCK', 4, '2024-12-22 10:00:00', 'admin', '2024-12-22 10:00:00', 'admin');

INSERT INTO product (id, code, name, description, image, category, price, quantity, internal_reference, shell_id, inventory_status, rating, created_at, created_by, updated_at, updated_by)
VALUES (6, 'GR006', 'Cheddar Cheese', 'Sharp cheddar cheese, perfect for sandwiches or snacks.', 'cheddar_cheese.jpg', 'Groceries', 4.49, 100, 'GRN006', 3, 'INSTOCK', 5, '2024-12-22 10:00:00', 'admin', '2024-12-22 10:00:00', 'admin');

INSERT INTO product (id, code, name, description, image, category, price, quantity, internal_reference, shell_id, inventory_status, rating, created_at, created_by, updated_at, updated_by)
VALUES (7, 'GR007', 'Tomatoes (3 pack)', 'Fresh vine-ripened tomatoes, perfect for salads or cooking.', 'tomatoes.jpg', 'Groceries', 2.79, 90, 'GRN007', 1, 'INSTOCK', 4, '2024-12-22 10:00:00', 'admin', '2024-12-22 10:00:00', 'admin');

INSERT INTO product (id, code, name, description, image, category, price, quantity, internal_reference, shell_id, inventory_status, rating, created_at, created_by, updated_at, updated_by)
VALUES (8, 'GR008', 'Rice (2kg)', '2kg bag of long grain white rice, a pantry staple.', 'rice.jpg', 'Groceries', 3.99, 150, 'GRN008', 2, 'INSTOCK', 4, '2024-12-22 10:00:00', 'admin', '2024-12-22 10:00:00', 'admin');

INSERT INTO product (id, code, name, description, image, category, price, quantity, internal_reference, shell_id, inventory_status, rating, created_at, created_by, updated_at, updated_by)
VALUES (9, 'GR009', 'Frozen Peas (500g)', '500g pack of frozen peas, ideal for cooking or as a side dish.', 'frozen_peas.jpg', 'Groceries', 1.99, 120, 'GRN009', 3, 'INSTOCK', 4, '2024-12-22 10:00:00', 'admin', '2024-12-22 10:00:00', 'admin');

INSERT INTO product (id, code, name, description, image, category, price, quantity, internal_reference, shell_id, inventory_status, rating, created_at, created_by, updated_at, updated_by)
VALUES (10, 'GR010', 'Oats (500g)', '500g bag of rolled oats, great for breakfast or baking.', 'oats.jpg', 'Groceries', 2.49, 180, 'GRN010', 2, 'INSTOCK', 4, '2024-12-22 10:00:00', 'admin', '2024-12-22 10:00:00', 'admin');

-- Reset the sequence to the current maximum ID
ALTER SEQUENCE PRODUCT_SEQ RESTART WITH (SELECT MAX(id) FROM product) + 1;


