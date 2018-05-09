package name.lizhe.lira.module.user.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	public @ResponseBody List<UserBean> getUsersStartWith(HttpServletRequest request, HttpServletResponse response) {
		String project_id = request.getParameter("project_id");
		String startWith = request.getParameter("startWith");
		String issue_id = request.getParameter("issue_id");
		
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("project_id", project_id);
		map.put("startWith", startWith);
		map.put("issue_id", issue_id);
		
		List<UserBean> results = userService.getUsersStartWith(map);
		return results;
	}

}
