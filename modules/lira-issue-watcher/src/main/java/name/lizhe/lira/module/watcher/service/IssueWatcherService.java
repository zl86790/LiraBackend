package name.lizhe.lira.module.watcher.service;

import java.util.List;

import name.lizhe.lira.module.watcher.bean.IssueWatcherBean;

public interface IssueWatcherService {
	public List<IssueWatcherBean> getIssueWatchers(String issue_id);
	public int insertWatcher(IssueWatcherBean watcher);
	public int deleteWatcher(IssueWatcherBean watcher);
	public boolean watchstatus(IssueWatcherBean watcher); 
}
