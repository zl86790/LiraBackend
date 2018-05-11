CREATE TABLE `tb_sequence` (
  `name` varchar(50) NOT NULL,
  `current_value` int(11) NOT NULL,
  `_increment` int(11) NOT NULL DEFAULT 1,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

















DELIMITER //

create function _nextval(n varchar(50)) returns varchar(50)


begin  
declare _cur int; 
declare _projectKey varchar(50);
set _projectKey=(select project_key from Projects where id= n);
set _cur=(select current_value from tb_sequence where name= _projectKey for update);  
update tb_sequence  
 set current_value = _cur + _increment  
 where name= _projectKey ;  
return CONCAT(_projectKey,'-',_cur);  
end


//