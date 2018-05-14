CREATE TABLE `Users` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `full_name` varchar(100) NOT NULL,
  `email_address` varchar(100) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `name_unique` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

