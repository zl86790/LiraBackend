CREATE TABLE `ProjectUsers` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `user_id` int(10) unsigned NOT NULL,
  `project_id` int(10) unsigned NOT NULL,
  PRIMARY KEY (`id`),
  KEY `projectidpk` (`project_id`),
  KEY `uidpk` (`user_id`),
  CONSTRAINT `projectidpk` FOREIGN KEY (`project_id`) REFERENCES `Projects` (`id`),
  CONSTRAINT `uidpk` FOREIGN KEY (`user_id`) REFERENCES `Users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

