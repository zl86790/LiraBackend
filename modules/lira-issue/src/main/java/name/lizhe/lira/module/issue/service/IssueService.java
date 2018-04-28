package name.lizhe.lira.module.issue.service;

import java.util.List;
import java.util.Map;

import name.lizhe.lira.module.issue.bean.IssueBean;

public interface IssueService {
	public void createIssue(IssueBean issueBean);
	public List<IssueBean> getIssues(Map<String,String> map);
	public IssueBean getIssueById(String id);
	public String getIssueCounts(Map<String,String> map);
	public List<IssueBean> getIssuesByCondition(Map<String,String> map);
	public String getIssueCountsByCondition(Map<String,String> map);
}
