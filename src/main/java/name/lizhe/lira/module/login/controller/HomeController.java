package name.lizhe.lira.module.login.controller;

import static name.lizhe.lira.app.tool.JwtUtil.HEADER_STRING;
import static name.lizhe.lira.app.tool.JwtUtil.TOKEN_PREFIX;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import name.lizhe.lira.app.tool.JwtUtil;
import name.lizhe.lira.module.user.bean.UserBean;

@RestController
public class HomeController {
	
    @GetMapping("/api/hello")
    public @ResponseBody Object hellWorld() {
        return "Hello World! This is a protected api";
    }

    @PostMapping("/login")
    public @ResponseBody String login(HttpServletResponse response,
                      @RequestBody final UserBean userBean) throws IOException {
        if(validCredentials(userBean)) {
            String jwt = JwtUtil.generateToken(userBean.getUsername());
//            response.addHeader(HEADER_STRING, TOKEN_PREFIX + " " + jwt);
            return TOKEN_PREFIX + " " + jwt;
        }else
            response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Wrong credentials");
		return null;
    }

    private boolean validCredentials(UserBean userBean) {
        return "admin".equals(userBean.getUsername())
                && "admin".equals(userBean.getPassword());
    }

	
}
