CREATE TABLE `ShoppingCart` (
`cart_items_id` int(11) NOT NULL AUTO_INCREMENT,
`user_id` int(20) DEFAULT NULL,
`product_id` int(11) DEFAULT NULL,
CONSTRAINT `cart_items_PK`
  PRIMARY KEY (`cart_items_id`),
CONSTRAINT `product_FK`
  FOREIGN KEY (`product_id`)
  REFERENCES `Inventory`(`product_id`),
CONSTRAINT `user_FK`
  FOREIGN KEY (`user_id`)
  REFERENCES `Users`(`user_id`)
);
