CREATE TABLE `Inventory` (
`product_id` int(11) NOT NULL AUTO_INCREMENT,
`product_name` varchar(100) DEFAULT NULL,
`product_department` varchar(100) DEFAULT NULL,
`product_price` double DEFAULT NULL,
`initial_quantity` int(11) DEFAULT NULL,
`stock_quantity` int(11) DEFAULT NULL,
`sold_units` int(11) DEFAULT NULL,
PRIMARY KEY (`product_id`)
);
