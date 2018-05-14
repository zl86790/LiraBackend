CREATE TABLE `SystemParameters` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `module_key` varchar(50) NOT NULL,
  `value_key` varchar(50) NOT NULL,
  `value_content` varchar(1000) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
