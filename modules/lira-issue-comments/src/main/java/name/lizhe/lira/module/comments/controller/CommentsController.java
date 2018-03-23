package name.lizhe.lira.module.comments.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

}
