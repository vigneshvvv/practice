package com.stgit.timesheet.service;

import org.springframework.stereotype.Service;

import com.stgit.timesheet.dto.TaskDto;
import com.stgit.timesheet.entity.Task;
import com.stgit.timesheet.utilities.Response;

@Service
public interface TaskService {
	
	public Task addtask(Task task);
	
	public Response editTask(TaskDto request);

	public Response deleteTask(int id);
	
	

}
