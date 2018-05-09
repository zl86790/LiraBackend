package name.lizhe.lira.module.user.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import name.lizhe.lira.module.user.bean.UserBean;

public interface UserMapper {

	List<UserBean> getUsers(String project_id);

	List<UserBean> getAllUsers();

	List<UserBean> getUsersStartWith(Map<String, Object> map);

}
