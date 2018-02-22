package name.lizhe.lira.module.issue.dao.mapper;

import org.apache.ibatis.annotations.Mapper;

import name.lizhe.lira.module.issue.bean.IssueBean;

@Mapper
public interface IssueMapper {
	
	public void createIssue(IssueBean issueBean);
	
}
