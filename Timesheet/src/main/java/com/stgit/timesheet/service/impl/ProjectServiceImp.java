package com.stgit.timesheet.service.impl;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stgit.timesheet.dto.ProjectDto;
import com.stgit.timesheet.entity.Project;
import com.stgit.timesheet.repository.ProjectRepo;
import com.stgit.timesheet.service.ProjectService;

@Service
public class ProjectServiceImp implements ProjectService{
	
	
	@Autowired
	ProjectRepo projectRepo;
	
	public List<Project> getallproject() {
		return projectRepo.findAll();
	}
	
	public Project insertproject(Project project)
	{
		return projectRepo.save(project);
	}
	
	public Project addproject(ProjectDto projectDto)
	{
		
		ModelMapper mm = new ModelMapper();
		Project proEnt = mm.map(projectDto, Project.class);
		
		return projectRepo.save(proEnt);
	}

}
