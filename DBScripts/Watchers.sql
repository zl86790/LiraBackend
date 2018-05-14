CREATE TABLE `Watchers` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `issue_id` int(10) unsigned NOT NULL,
  `user_id` int(10) unsigned NOT NULL,
  `updated_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `issue_id_user_id` (`issue_id`,`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

