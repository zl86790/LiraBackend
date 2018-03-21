package name.lizhe.lira.module.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.lizhe.lira.module.project.bean.ProjectBean;
import name.lizhe.lira.module.project.dao.mapper.ProjectMapper;
import name.lizhe.lira.module.project.service.ProjectService;

@Service
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	ProjectMapper projectMapper;
	
	@Override
	public void createProject(ProjectBean projectBean) {
		projectMapper.createProject(projectBean);
	}

}
