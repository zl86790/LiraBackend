package name.lizhe.lira.module.user.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.lizhe.lira.module.user.bean.UserBean;
import name.lizhe.lira.module.user.dao.mapper.UserMapper;
import name.lizhe.lira.module.user.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;
	
	@Override
	public List<UserBean> getUsers(String project_id) {
		return userMapper.getUsers(project_id);
	}

}
