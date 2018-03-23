package name.lizhe.lira.module.comments.service;

import java.util.List;

import name.lizhe.lira.module.comments.bean.CommentsBean;

public interface CommentsService {
	public List<CommentsBean> getIssueComments(String issue_id);
}
