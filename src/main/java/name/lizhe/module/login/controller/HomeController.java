package name.lizhe.module.login.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@RequestMapping(value="/login.do")
	public String gotoHome(){
		return "hello world";
	}
}
