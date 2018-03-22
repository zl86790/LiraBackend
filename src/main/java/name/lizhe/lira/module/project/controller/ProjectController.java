package name.lizhe.lira.module.project.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import name.lizhe.lira.module.project.bean.ProjectBean;
import name.lizhe.lira.module.project.service.ProjectService;

@RestController
public class ProjectController {
	
	@Autowired
	ProjectService projectService;
	
    @PostMapping("/api/v1/postlogin/project")
    public @ResponseBody Object createProject(HttpServletResponse response,
            @RequestBody final ProjectBean projectBean) {
        
    	projectService.createProject(projectBean);
    	
    	Map<String,String> result = new HashMap<>();
    	result.put("message", "success");
		return result;
    }

   @GetMapping("/api/v1/postlogin/projects")
   public @ResponseBody List<ProjectBean> getProjects(){
	   return projectService.getProjects();
   }

	
}
