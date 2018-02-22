package name.lizhe.lira.module.issue.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.lizhe.lira.module.issue.bean.IssueBean;
import name.lizhe.lira.module.issue.dao.mapper.IssueMapper;
import name.lizhe.lira.module.issue.service.IssueService;

@Service
public class IssueServiceImpl implements IssueService {

	@Autowired
	IssueMapper issueMapper;
	
	@Override
	public void createIssue(IssueBean issueBean) {
		issueMapper.createIssue(issueBean);
	}

}
