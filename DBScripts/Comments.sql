CREATE TABLE `Comments` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `issue_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `content` varchar(5000) NOT NULL,
  `updated_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `issueidpk` (`issue_id`),
  KEY `useridpk` (`user_id`),
  CONSTRAINT `issueidpk` FOREIGN KEY (`issue_id`) REFERENCES `Issues` (`id`),
  CONSTRAINT `useridpk` FOREIGN KEY (`user_id`) REFERENCES `Users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

