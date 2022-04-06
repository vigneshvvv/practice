package com.stgit.timesheet.service;

import java.util.List;

import com.stgit.timesheet.dto.ProjectDto;
import com.stgit.timesheet.entity.Project;

public interface ProjectService {
	
	public List<Project> getallproject();
	
	public Project insertproject(Project project);
	
	public Project addproject(ProjectDto projectDto);

}
