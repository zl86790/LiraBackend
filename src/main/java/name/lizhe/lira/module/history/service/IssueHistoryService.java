package name.lizhe.lira.module.history.service;

import java.util.List;

import name.lizhe.lira.module.history.bean.IssueHistoryBean;
import name.lizhe.lira.module.watcher.bean.IssueWatcherBean;

public interface IssueHistoryService {
	public List<IssueHistoryBean> getIssueHistories(String issue_id);
}
