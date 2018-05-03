package name.lizhe.lira.module.issue.service.impl;

import java.util.HashMap;
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
		List<IssueBean> results = issueMapper.getIssues(map);
		return results;
	}

	@Override
	public IssueBean getIssueById(String id) {
		return issueMapper.getIssueById(id);
	}

	@Override
	public String getIssueCounts(Map<String,String> map) {
		return issueMapper.getIssueCounts(map);
	}

	@Override
	public List<IssueBean> getIssuesByCondition(Map<String, String> map) {
		return issueMapper.getIssuesByCondition(map);
	}

	@Override
	public String getIssueCountsByCondition(Map<String, String> map) {
		return issueMapper.getIssueCountsByCondition(map);
	}

	@Override
	public int updateIssueDes(IssueBean issueBean) {
		Map<String,String> map = new HashMap<>();
		map.put("id", String.valueOf(issueBean.getId()));
		map.put("description", issueBean.getDescription());
		map.put("type", issueBean.getType());
		return issueMapper.updateIssueDes(map);
	}

}
