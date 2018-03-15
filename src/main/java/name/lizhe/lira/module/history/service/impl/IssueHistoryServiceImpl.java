package name.lizhe.lira.module.history.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import name.lizhe.lira.module.history.bean.IssueHistoryBean;
import name.lizhe.lira.module.history.dao.mapper.HistoryMapper;
import name.lizhe.lira.module.history.service.IssueHistoryService;

public class IssueHistoryServiceImpl implements IssueHistoryService {

	@Autowired
	HistoryMapper historyMapper;
	
	@Override
	public List<IssueHistoryBean> getIssueHistories(String issue_id) {
		return historyMapper.getIssueHistories(issue_id);
	}

}
