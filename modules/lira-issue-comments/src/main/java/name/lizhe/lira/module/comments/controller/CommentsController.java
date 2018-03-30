package name.lizhe.lira.module.comments.controller;

import java.io.IOException;
import java.util.Calendar;
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

import name.lizhe.lira.module.comments.bean.CommentsBean;
import name.lizhe.lira.module.comments.service.CommentsService;

@RestController
public class CommentsController {

	@Autowired
	CommentsService commentsService;
	

    @GetMapping("/api/v1/postlogin/comments")
    public @ResponseBody List<CommentsBean> getIssueComments(String issue_id) throws IOException {
    	
    	return commentsService.getIssueComments(issue_id);
    	
    }
    
    @PostMapping("/api/v1/postlogin/comments")
    public @ResponseBody Map<String,String> addComments(HttpServletResponse response,@RequestBody CommentsBean commentsBean) throws IOException {
    	
    	commentsBean.setUpdated_time(Calendar.getInstance().getTime());
    	commentsService.addComments(commentsBean);
    	Map<String,String> result = new HashMap<>();
    	result.put("message", "success");
    	return result;
    	
    }

}
