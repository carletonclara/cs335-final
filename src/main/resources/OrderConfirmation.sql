CREATE TABLE `OrderConfirmation` (
`order_id` int(11) NOT NULL AUTO_INCREMENT,
`user_ID` int(20) DEFAULT NULL,
`final_price` double DEFAULT NULL,
`purchase_date` date DEFAULT NULL,
PRIMARY KEY (`order_id`),
CONSTRAINT `user_FK2`
  FOREIGN KEY (`user_id`)
  REFERENCES `Users`(`user_id`)
);
