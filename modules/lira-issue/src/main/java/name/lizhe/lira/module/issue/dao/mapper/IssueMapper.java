package name.lizhe.lira.module.issue.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import name.lizhe.lira.module.issue.bean.IssueBean;

@Mapper
public interface IssueMapper {
	
	public void createIssue(IssueBean issueBean);

	public List<IssueBean> getIssues(Map<String,String> map);
	
	public IssueBean getIssueById(String id);

	public String getIssueCounts(Map<String,String> map);
	
	public List<IssueBean> getIssuesByCondition(Map<String,String> map);
	public String getIssueCountsByCondition(Map<String,String> map);

	public int updateIssueDes(Map<String,Object> map);
	
}
