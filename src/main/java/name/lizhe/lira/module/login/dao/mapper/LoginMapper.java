package name.lizhe.lira.module.login.dao.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import name.lizhe.lira.module.user.bean.UserBean;

@Mapper
public interface LoginMapper {
	
	UserBean doLogin(@Param("userName") String userName, @Param("passWord") String passWord);
	
	@Delete("DELETE FROM Users WHERE id =#{id}")
	void del(int id);
}
