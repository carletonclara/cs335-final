CREATE TABLE `StateSalesTax` (
`state_id` int(11) NOT NULL,
`state_initial` varchar(2) DEFAULT NULL,
`state_name` varchar(20) DEFAULT NULL,
`state_tax_rate` double DEFAULT NULL,
PRIMARY KEY (`state_id`)
);
