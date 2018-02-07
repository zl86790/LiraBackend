package name.lizhe.lira.module.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import name.lizhe.lira.module.user.bean.UserBean;

@RestController
public class HomeController {
	
	@Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@RequestMapping(value="/login.do")
	public String gotoHome(){
		return "hello world";
	}
	
	@PostMapping("/signup.do")
    public void signUp(@RequestBody UserBean user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
    }
	
	@Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**").allowedOrigins("http://localhost:8080");
            }
        };
    }
	
	
}
