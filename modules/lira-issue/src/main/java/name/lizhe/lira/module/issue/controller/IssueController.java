package name.lizhe.lira.module.issue.controller;

import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
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

	@Autowired
	protected RedisTemplate<String, Object> redisTemplate;

	@PostMapping("/api/v1/postlogin/issue")
	public @ResponseBody Map<String, String> createIssue(HttpServletResponse response,
			@RequestBody final IssueBean issueBean) throws IOException {

		issueBean.setCreated_time(Calendar.getInstance().getTime());
		issueBean.setUpdated_time(Calendar.getInstance().getTime());
		issueBean.setResolved_time(null);
		issueService.createIssue(issueBean);

		Map<String, String> result = new HashMap<>();
		result.put("message", "success");
		return result;
	}

	@PostMapping("/api/v1/postlogin/updateIssue")
	public @ResponseBody Map<String, String> updateIssueDes(@RequestBody final IssueBean issueBean, HttpServletResponse response)
			throws IOException, ParseException {

		if(!StringUtils.isEmpty(issueBean.getUpdated_time_input_str())){
			Date updated_time = issueBean.simpleDateFormat.parse(issueBean.getUpdated_time_input_str());
			issueBean.setUpdated_time(updated_time);
		}
		int count = issueService.updateIssueDes(issueBean);
		Map<String, String> result = new HashMap<>();
		result.put("message", "success");
		return result;
	}

	@GetMapping("/api/v1/postlogin/issueCounts")
	public @ResponseBody String getIssueCounts(HttpServletRequest request) throws IOException {
		String username = request.getAttribute("username").toString();

		Map<String, String> map = new HashMap<String, String>();
		map.put("username", username);
		String issuesNumber = issueService.getIssueCounts(map);
		return String.valueOf(issuesNumber);
	}

	@GetMapping("/api/v1/postlogin/issues")
	public @ResponseBody List<IssueBean> getIssues(HttpServletRequest request) throws IOException {
		String username = request.getAttribute("username").toString();
		Map<String, String> map = new HashMap<String, String>();

		HashOperations<String, String, Map> hashOperations = redisTemplate.opsForHash();
		Map<String, Object> user = hashOperations.get(request.getAttribute("jwt").toString(), "user");

		String pageNumber = "0";
		if (!StringUtils.isEmpty(request.getParameter("pageNumber"))) {
			pageNumber = request.getParameter("pageNumber");
		}
		String rowNumber = "10";
		if (!StringUtils.isEmpty(request.getParameter("rowNumber"))) {
			rowNumber = request.getParameter("rowNumber");
		}

		map.put("name", username);
		map.put("pageNumber", String.valueOf(Integer.parseInt(pageNumber) * Integer.parseInt(rowNumber)));
		map.put("rowNumber", rowNumber);

		return issueService.getIssues(map);

	}

	@GetMapping("/api/v1/postlogin/issueCountsByCondition")
	public @ResponseBody String getIssueCountsByCondition(HttpServletRequest request) throws IOException {
		String project_id = request.getParameter("project_id");
		if (project_id == "-1") {
			project_id = null;
		}
		Map<String, String> map = new HashMap<String, String>();
		map.put("project_id", project_id);
		String issuesNumber = issueService.getIssueCountsByCondition(map);
		return String.valueOf(issuesNumber);
	}

	@GetMapping("/api/v1/postlogin/issuesByCondition")
	public @ResponseBody List<IssueBean> getIssuesByCondition(HttpServletRequest request) throws IOException {
		String project_id = request.getParameter("project_id");
		if (project_id == "-1") {
			project_id = null;
		}
		Map<String, String> map = new HashMap<String, String>();
		String pageNumber = "0";
		if (!StringUtils.isEmpty(request.getParameter("pageNumber"))) {
			pageNumber = request.getParameter("pageNumber");
		}
		String rowNumber = "10";
		if (!StringUtils.isEmpty(request.getParameter("rowNumber"))) {
			rowNumber = request.getParameter("rowNumber");
		}

		map.put("project_id", project_id);
		map.put("pageNumber", String.valueOf(Integer.parseInt(pageNumber) * Integer.parseInt(rowNumber)));
		map.put("rowNumber", rowNumber);

		return issueService.getIssuesByCondition(map);

	}

	@GetMapping("/api/v1/postlogin/issue")
	public @ResponseBody IssueBean getIssueById(String id) throws IOException {
		IssueBean bean = issueService.getIssueById(id);
		return bean;

	}
}
