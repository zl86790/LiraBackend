package name.lizhe.lira.module.login.controller;

import static name.lizhe.lira.app.tool.JwtUtil.TOKEN_PREFIX;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import name.lizhe.lira.app.tool.JwtUtil;
import name.lizhe.lira.module.login.service.LoginService;
import name.lizhe.lira.module.login.service.impl.LoginServiceImpl;
import name.lizhe.lira.module.user.bean.UserBean;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
    @GetMapping("/api/v1/postlogin/hello")
    public @ResponseBody Object hellWorld(HttpServletRequest request) {
        return "Hello World! This is a protected api "+request.getAttribute("username");
    }

    @PostMapping("/api/v1/prelogin/login")
    public @ResponseBody Map login(HttpServletResponse response,
                      @RequestBody final UserBean userBean) throws IOException {
        if(validCredentials(userBean)) {
            String jwt = JwtUtil.generateToken(userBean.getUserName());
//          response.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + jwt);
            Map<String,String> result = new HashMap<>();
            result.put("token", TOKEN_PREFIX + " " + jwt);
            return result;
        }else
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Wrong credentials");
		return null;
    }

    private boolean validCredentials(UserBean userBean) {
    	if(loginService.doLogin(userBean.getUserName(),userBean.getPassWord())!=null){
    		return true;
    	}
        return false;
    }

	
}
