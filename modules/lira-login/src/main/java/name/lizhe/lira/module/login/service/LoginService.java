package name.lizhe.lira.module.login.service;

import name.lizhe.lira.module.user.bean.UserBean;

public interface LoginService {
	UserBean doLogin(String username,String password);
}
