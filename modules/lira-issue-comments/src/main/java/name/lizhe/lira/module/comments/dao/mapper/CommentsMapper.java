package name.lizhe.lira.module.comments.dao.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import name.lizhe.lira.module.comments.bean.CommentsBean;

@Mapper
public interface CommentsMapper {
	public List<CommentsBean> getIssueComments(String issue_id);
	public Map<String, String> addComments(CommentsBean commentsBean);
}
