package name.lizhe.lira.module.comments.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.lizhe.lira.module.comments.bean.CommentsBean;
import name.lizhe.lira.module.comments.dao.mapper.CommentsMapper;
import name.lizhe.lira.module.comments.service.CommentsService;

@Service
public class CommentsServiceImpl implements CommentsService {

	@Autowired
	CommentsMapper commentsMapper;
	
	@Override
	public List<CommentsBean> getIssueComments(String issue_id) {
		return commentsMapper.getIssueComments("57");
	}

}
