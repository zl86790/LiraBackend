package name.lizhe.lira.module.sysparameter.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import name.lizhe.lira.module.sysparameter.bean.SysParameterBean;
import name.lizhe.lira.module.sysparameter.service.SysParameterService;

@RestController
public class SysParameterController {
	
	@Autowired
	SysParameterService sysParameterService;

   @GetMapping("/api/v1/postlogin/sysparameters")
   public @ResponseBody List<SysParameterBean> getProjects(@RequestParam final Map<String,String> map){
	   
	   String module_key = map.get("module_key");
	   String value_key = map.get("value_key");
	   
	   return sysParameterService.getValues(module_key,value_key);
   }

	
}
