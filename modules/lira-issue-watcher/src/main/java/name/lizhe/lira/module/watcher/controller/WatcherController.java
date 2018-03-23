package name.lizhe.lira.module.watcher.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import name.lizhe.lira.module.watcher.bean.IssueWatcherBean;
import name.lizhe.lira.module.watcher.service.IssueWatcherService;

@RestController
public class WatcherController {

	@Autowired
	IssueWatcherService issueWatcherService;
	

    @GetMapping("/api/v1/postlogin/issuewatchers")
    public @ResponseBody List<IssueWatcherBean> getIssueComments(String issue_id) throws IOException {
    	
    	return issueWatcherService.getIssueWatchers(issue_id);
    	
    }

}
