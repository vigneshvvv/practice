package com.stgit.timesheet.service.impl;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.stgit.timesheet.dto.TaskDto;
import com.stgit.timesheet.entity.Task;
import com.stgit.timesheet.repository.TaskRepo;
import com.stgit.timesheet.service.TaskService;
import com.stgit.timesheet.utilities.Response;

@Service
public class TaskServiceImpl implements TaskService{

	Response response = new Response();
	@Autowired
	TaskRepo taskRepo;
	
	@Override
	public Task addtask(Task task) {
		return taskRepo.save(task) ;
	}

	@Override
	public Response editTask(TaskDto request) {
		ModelMapper mm = new ModelMapper();
		Task taskDao = mm.map(request, Task.class); 
		
		Task out = taskRepo.save(taskDao);
		
		
		response.setResponseType("S");
		response.setResponseValue(out);
		
		
		
		// TODO Auto-generated method stub
		return response;
	}


	@Override
	public Response deleteTask(int id) {
		
		taskRepo.deleteById(id);
		Task out= taskRepo.findById(id);
		
		response.setResponseType("s");
		response.setResponseValue(out);
		return response;
	}
	
	

}
