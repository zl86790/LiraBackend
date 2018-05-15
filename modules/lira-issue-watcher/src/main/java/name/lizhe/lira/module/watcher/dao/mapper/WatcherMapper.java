package name.lizhe.lira.module.watcher.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import name.lizhe.lira.module.watcher.bean.IssueWatcherBean;

@Mapper
public interface WatcherMapper {
	public List<IssueWatcherBean> getIssueWatchers(String issue_id);
	public int insertWatcher(IssueWatcherBean watcher);
	public int deleteWatcher(IssueWatcherBean watcher); 
}
