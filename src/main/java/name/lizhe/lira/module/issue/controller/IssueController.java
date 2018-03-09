package name.lizhe.lira.module.issue.controller;

import java.io.IOException;
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

import name.lizhe.lira.module.issue.bean.IssueBean;
import name.lizhe.lira.module.issue.service.IssueService;

@RestController
public class IssueController {

	@Autowired
	IssueService issueService;
	
    @PostMapping("/api/v1/postlogin/issue")
    public @ResponseBody Map<String,String> createIssue(HttpServletResponse response,
                      @RequestBody final IssueBean issueBean) throws IOException {
    	
    	issueService.createIssue(issueBean);
    	
    	Map<String,String> result = new HashMap<>();
    	result.put("message", "success");
		return result;
    }
    
    @GetMapping("/api/v1/postlogin/issues")
    public @ResponseBody List<IssueBean> getIssues(String name) throws IOException {
    	
    	return issueService.getIssues(name);
    	
    }
    
    @GetMapping("/api/v1/postlogin/issue")
    public @ResponseBody IssueBean getIssueById(String id) throws IOException {
    	IssueBean bean = issueService.getIssueById(id);
    	return bean;
    	
    }
}
