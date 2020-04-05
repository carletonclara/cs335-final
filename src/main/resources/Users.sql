CREATE TABLE `Users` (
`user_id` int(20) NOT NULL AUTO_INCREMENT,
`user_name` varchar(25) DEFAULT NULL,
`address_id` int(20),
`email` varchar(50) DEFAULT NULL,
CONSTRAINT `user_PK`
  PRIMARY KEY (`user_id`),
CONSTRAINT `address_FK`
  FOREIGN KEY (`address_id`)
    REFERENCES `Address`(`address_id`)
);
