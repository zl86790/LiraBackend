package name.lizhe.lira.module.login.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.lizhe.lira.module.login.dao.mapper.LoginMapper;
import name.lizhe.lira.module.login.service.LoginService;
import name.lizhe.lira.module.user.bean.UserBean;

@Service
public class LoginServiceImpl implements LoginService{
	
	@Autowired
    private LoginMapper loginMapper;
	

	public UserBean doLogin(String username, String password) {
		return loginMapper.doLogin(username, password);
	}

}
