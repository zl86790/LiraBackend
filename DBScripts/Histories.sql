CREATE TABLE `Histories` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `issue_id` int(10) unsigned NOT NULL,
  `operator` int(10) unsigned NOT NULL,
  `action` varchar(200) NOT NULL,
  `updated_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `issueIdhistoryPk` (`issue_id`),
  KEY `userIdhistoryPk` (`operator`),
  CONSTRAINT `issueIdhistoryPk` FOREIGN KEY (`issue_id`) REFERENCES `Issues` (`id`),
  CONSTRAINT `userIdhistoryPk` FOREIGN KEY (`operator`) REFERENCES `Users` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

