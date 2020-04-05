CREATE TABLE `PaymentMethod` (
`payment_id` int(11) NOT NULL AUTO_INCREMENT,
`user_id` int(20) DEFAULT NULL,
`card_number` varchar(16) DEFAULT NULL,
`payment_method_type` varchar(50) DEFAULT NULL,
PRIMARY KEY (`payment_id`),
CONSTRAINT `user_FK3`
  FOREIGN KEY (`user_id`)
  REFERENCES `Users`(`user_id`)
);
