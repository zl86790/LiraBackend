package name.lizhe.lira.module.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import name.lizhe.lira.module.user.bean.UserBean;
import name.lizhe.lira.module.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	UserService userService;

	@GetMapping("/api/v1/postlogin/users")
	public @ResponseBody List<UserBean> getUsers(String project_id) {
		List<UserBean> results = userService.getUsers(project_id);
		return results;
	}
	
	@GetMapping("/api/v1/postlogin/allusers")
	public @ResponseBody List<UserBean> getAllUsers(String project_id) {
		List<UserBean> results = userService.getAllUsers();
		return results;
	}
	
	@GetMapping("/api/v1/postlogin/usersStartWith")
	public @ResponseBody List<UserBean> getUsersStartWith(String project_id, String startWith) {
		List<UserBean> results = userService.getUsersStartWith(project_id,startWith);
		return results;
	}

}
