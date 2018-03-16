package name.lizhe.lira.module.history.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import name.lizhe.lira.module.comments.bean.CommentsBean;
import name.lizhe.lira.module.comments.service.CommentsService;
import name.lizhe.lira.module.history.bean.IssueHistoryBean;
import name.lizhe.lira.module.history.service.IssueHistoryService;

@RestController
public class HistoryController {

	@Autowired
	IssueHistoryService issueHistoryService;
	

    @GetMapping("/api/v1/postlogin/issuehistories")
    public @ResponseBody List<IssueHistoryBean> getIssueComments(String issue_id) throws IOException {
    	
    	return issueHistoryService.getIssueHistories(issue_id);
    	
    }

}
