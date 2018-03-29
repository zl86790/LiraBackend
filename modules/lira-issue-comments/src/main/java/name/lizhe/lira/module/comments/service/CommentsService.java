package name.lizhe.lira.module.comments.service;

import java.util.List;
import java.util.Map;

import name.lizhe.lira.module.comments.bean.CommentsBean;

public interface CommentsService {
	public List<CommentsBean> getIssueComments(String issue_id);

	public Map<String, String> addComments(CommentsBean commentsBean);
}
