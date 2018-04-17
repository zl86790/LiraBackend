package name.lizhe.lira.module.issue.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
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
    	
    	issueBean.setCreated_time(Calendar.getInstance().getTime());
    	issueBean.setUpdated_time(Calendar.getInstance().getTime());
    	issueBean.setResolved_time(null);
    	issueService.createIssue(issueBean);
    	
    	Map<String,String> result = new HashMap<>();
    	result.put("message", "success");
		return result;
    }
    
    @GetMapping("/api/v1/postlogin/issueCounts")
    public @ResponseBody String getIssueCounts(HttpServletRequest request) throws IOException {
    	String username = request.getAttribute("username").toString();
    	String issuesNumber = issueService.getIssueCounts(username);
		return String.valueOf(issuesNumber);
    }
    
    @GetMapping("/api/v1/postlogin/issues")
    public @ResponseBody List<IssueBean> getIssues(HttpServletRequest request) throws IOException {
    	String username = request.getAttribute("username").toString();
    	Map<String,String> map = new HashMap<String,String>();
    	
    	String pageNumber = "0";
    	if(!StringUtils.isEmpty(request.getParameter("pageNumber"))){
    		pageNumber = request.getParameter("pageNumber");
    	}
    	String rowNumber = "10";
    	if(!StringUtils.isEmpty(request.getParameter("rowNumber"))){
    		rowNumber = request.getParameter("rowNumber");
    	}
    	
    	map.put("name", username);
    	map.put("pageNumber", String.valueOf(Integer.parseInt(pageNumber)*Integer.parseInt(rowNumber)));
    	map.put("rowNumber", rowNumber);
    	
    	return issueService.getIssues(map);
    	
    	
    }
    
    @GetMapping("/api/v1/postlogin/issue")
    public @ResponseBody IssueBean getIssueById(String id) throws IOException {
    	IssueBean bean = issueService.getIssueById(id);
    	return bean;
    	
    }
}
