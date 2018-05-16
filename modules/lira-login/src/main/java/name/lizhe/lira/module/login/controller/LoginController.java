package name.lizhe.lira.module.login.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import name.lizhe.lira.app.tool.JwtUtil;
import name.lizhe.lira.module.login.service.LoginService;
import name.lizhe.lira.module.user.bean.UserBean;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginService;
	
    @GetMapping("/api/v1/postlogin/hello")
    public @ResponseBody Object hellWorld(HttpServletRequest request) {
        return "Hello World! This is a protected api "+request.getAttribute("username");
    }
    
	@Autowired
    protected RedisTemplate<String, Object> redisTemplate;

    @PostMapping("/api/v1/prelogin/login")
    public @ResponseBody Map login(HttpServletResponse response,
                      @RequestBody final UserBean userBean) throws IOException {
    	HashOperations<String, String, Map> hashOperations = redisTemplate.opsForHash();
    	UserBean user = validCredentials(userBean);
        if(user!=null) {
            String jwt = JwtUtil.generateToken(user.getUserName());
//          response.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + jwt);
            Map<String,String> result = new HashMap<>();
            result.put("lira_token", jwt);
            
            Map<String,Object> userMap = new HashMap<>();
            userMap.put("username", user.getUserName());
            userMap.put("userid", user.getId());
            hashOperations.put(jwt, "user", userMap);
            redisTemplate.expire(jwt, 60*30, TimeUnit.SECONDS);
            return result;
        }else
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Wrong credentials");
		return null;
    }

    private UserBean validCredentials(UserBean userBean) {
    	UserBean user = loginService.doLogin(userBean.getUserName(),userBean.getPassWord());
        return user;
    }

}
