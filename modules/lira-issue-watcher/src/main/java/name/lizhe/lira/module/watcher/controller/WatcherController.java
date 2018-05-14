package name.lizhe.lira.module.watcher.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import name.lizhe.lira.module.watcher.bean.IssueWatcherBean;
import name.lizhe.lira.module.watcher.service.IssueWatcherService;

@RestController
public class WatcherController {

	@Autowired
	IssueWatcherService issueWatcherService;
	@Autowired
    protected RedisTemplate<String, Object> redisTemplate;

	public static final String HEADER_STRING = "lira_token";
	
    @GetMapping("/api/v1/postlogin/issuewatchers")
    public @ResponseBody List<IssueWatcherBean> getIssueComments(String issue_id) throws IOException {
    	
    	return issueWatcherService.getIssueWatchers(issue_id);
    	
    }
    
    @PostMapping("/api/v1/postlogin/issuewatcher")
    public @ResponseBody Map<String, String> insertWatcher(@RequestBody IssueWatcherBean watcher,@RequestHeader HttpHeaders headers) throws IOException {
    	HashOperations<String, String, Map> hashOperations = redisTemplate.opsForHash();
    	String jwt = headers.getFirst(HEADER_STRING);
    	Map<String,Object> userMap = hashOperations.get(jwt, "user");
    	String userId = userMap.get("userid").toString();
    	watcher.setUser_id(Integer.parseInt(userId));
    	watcher.setUpdated_time(Calendar.getInstance().getTime());
    	int count = issueWatcherService.insertWatcher(watcher);
    	Map<String, String> result = new HashMap<>();
		result.put("message", "success");
		return result;
    	
    }

}
