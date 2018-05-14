CREATE TABLE `Projects` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(100) NOT NULL,
  `project_key` varchar(10) NOT NULL,
  `leader` int(11) unsigned NOT NULL,
  `type` varchar(10) NOT NULL,
  `category` varchar(10) DEFAULT NULL,
  `url` varchar(1000) DEFAULT NULL,
  `updated_time` datetime NOT NULL,
  `issue_key_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `ProjectsLeader2UsersId` (`leader`),
  CONSTRAINT `ProjectsLeader2UsersId` FOREIGN KEY (`leader`) REFERENCES `Users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8;

