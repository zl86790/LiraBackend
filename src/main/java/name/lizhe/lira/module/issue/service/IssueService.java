package name.lizhe.lira.module.issue.service;

import java.util.List;

import name.lizhe.lira.module.issue.bean.IssueBean;

public interface IssueService {
	public void createIssue(IssueBean issueBean);
	public List<IssueBean> getIssues(String name);
}
