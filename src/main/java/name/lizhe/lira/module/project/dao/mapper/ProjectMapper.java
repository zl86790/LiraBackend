package name.lizhe.lira.module.project.dao.mapper;

import java.util.List;

import name.lizhe.lira.module.project.bean.ProjectBean;

public interface ProjectMapper {
	public void createProject(ProjectBean projectBean);
	public List<ProjectBean> getProjects();
}
