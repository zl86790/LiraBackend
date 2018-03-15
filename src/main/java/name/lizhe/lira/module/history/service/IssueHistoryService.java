package name.lizhe.lira.module.history.service;

import java.util.List;

import name.lizhe.lira.module.history.bean.IssueHistoryBean;

public interface IssueHistoryService {
	public List<IssueHistoryBean> getIssueHistories(String issue_id);
}
