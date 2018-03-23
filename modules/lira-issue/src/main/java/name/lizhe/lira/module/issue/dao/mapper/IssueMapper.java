package name.lizhe.lira.module.issue.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import name.lizhe.lira.module.issue.bean.IssueBean;

@Mapper
public interface IssueMapper {
	
	public void createIssue(IssueBean issueBean);

	public List<IssueBean> getIssues(String name);
	
	public IssueBean getIssueById(String id);
	
}
