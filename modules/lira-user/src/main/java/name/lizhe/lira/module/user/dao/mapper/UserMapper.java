package name.lizhe.lira.module.user.dao.mapper;

import java.util.List;

import name.lizhe.lira.module.user.bean.UserBean;

public interface UserMapper {

	List<UserBean> getUsers(String project_id);

}
