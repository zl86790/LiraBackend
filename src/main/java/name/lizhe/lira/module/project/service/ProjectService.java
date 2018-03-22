package name.lizhe.lira.module.project.service;

import java.util.List;

import name.lizhe.lira.module.project.bean.ProjectBean;

public interface ProjectService {
	public void createProject(ProjectBean projectBean);
	public List<ProjectBean> getProjects();
}
