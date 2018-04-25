package name.lizhe.lira.module.user.service;

import java.util.List;

import name.lizhe.lira.module.user.bean.UserBean;

public interface UserService {

	List<UserBean> getUsers(String project_id);
	List<UserBean> getAllUsers();
	List<UserBean> getUsersStartWith(String project_id, String startWith);

}
