package com.stgit.timesheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stgit.timesheet.dto.ProjectDto;
import com.stgit.timesheet.entity.Project;
import com.stgit.timesheet.service.ProjectService;

@RestController

public class ProjectContoller {
	
	@Autowired
	ProjectService projectService;
	
	@GetMapping("allproject")
	public List<Project> getallproject()
	{
		return projectService.getallproject();
	}
	
	@PostMapping(value="/addproject")
	public Project insertproject(@RequestBody Project project)
	{
		return projectService.insertproject(project);
	}
	
	@PostMapping(value="/insertproject")
	public Project addproject(@RequestBody ProjectDto projectDto)
	{
		return projectService.addproject(projectDto);
	}

}
