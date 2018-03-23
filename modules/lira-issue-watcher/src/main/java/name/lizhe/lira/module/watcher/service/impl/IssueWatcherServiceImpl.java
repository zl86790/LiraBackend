package name.lizhe.lira.module.watcher.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.lizhe.lira.module.watcher.bean.IssueWatcherBean;
import name.lizhe.lira.module.watcher.dao.mapper.WatcherMapper;
import name.lizhe.lira.module.watcher.service.IssueWatcherService;

@Service
public class IssueWatcherServiceImpl implements IssueWatcherService {

	@Autowired
	WatcherMapper watcherMapper;

	@Override
	public List<IssueWatcherBean> getIssueWatchers(String issue_id) {
		return watcherMapper.getIssueWatchers(issue_id);
	}
	
}
