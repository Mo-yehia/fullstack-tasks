CREATE DATABASE productDB;
USE productDB;

CREATE TABLE product_details (
    id INT AUTO_INCREMENT PRIMARY KEY,
    expiration_date DATE NOT NULL,
    manufacturer VARCHAR(255) NOT NULL,
    price DOUBLE NOT NULL,
    available BOOLEAN NOT NULL DEFAULT FALSE
);

CREATE TABLE product (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    product_details_id INT,
    FOREIGN KEY (product_details_id) REFERENCES product_details(id)
);


INSERT INTO product_details (id, expiration_date, manufacturer, price, available) VALUES
(1, '2024-02-08', 'dina farms', 30, 1),
(2, '2024-02-15', 'abu elsayed', 100, 1),
(3, '2024-06-11', 'dina farms', 50, 1),
(4, '2024-02-29', 'cadbury', 60, 0);


INSERT INTO product (id, name, product_details_id) VALUES
(1, 'milk', 1),
(2, 'fish', 2),
(3, 'cheese', 3),
(4, 'chocolate', 4);
