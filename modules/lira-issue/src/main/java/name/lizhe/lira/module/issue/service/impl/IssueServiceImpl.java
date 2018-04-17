package name.lizhe.lira.module.issue.service.impl;

import java.util.List;
import java.util.Map;

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

	@Override
	public List<IssueBean> getIssues(Map<String,String> map) {
		return issueMapper.getIssues(map);
	}

	@Override
	public IssueBean getIssueById(String id) {
		return issueMapper.getIssueById(id);
	}

	@Override
	public String getIssueCounts(String username) {
		return issueMapper.getIssueCounts(username);
	}

}
