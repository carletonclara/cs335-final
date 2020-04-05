CREATE TABLE Address (
`address_id` int(20) NOT NULL AUTO_INCREMENT,
`shipping_address` varchar(200) DEFAULT NULL,
`city` varchar(50) DEFAULT NULL,
`state` varchar(2) DEFAULT NULL,
`zip_code` varchar(5) DEFAULT NULL,
CONSTRAINT address_PK
  PRIMARY KEY (address_id)
);
