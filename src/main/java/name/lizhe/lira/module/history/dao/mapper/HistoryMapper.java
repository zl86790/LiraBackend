package name.lizhe.lira.module.history.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import name.lizhe.lira.module.comments.bean.CommentsBean;
import name.lizhe.lira.module.history.bean.IssueHistoryBean;

@Mapper
public interface HistoryMapper {
	public List<IssueHistoryBean> getIssueHistories(String issue_id);
}
