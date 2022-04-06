package com.stgit.timesheet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stgit.timesheet.dto.TaskDto;
import com.stgit.timesheet.entity.Task;
import com.stgit.timesheet.service.TaskService;
import com.stgit.timesheet.utilities.Response;

@RestController
public class TaskController {
	
	@Autowired
	TaskService taskService;
	
	Response response = new Response();
	
	@GetMapping("/task")
	public ResponseEntity<String> createtask(@PathVariable Task task){
		String status=(taskService.addtask(task)!= null)?"success":"failed";
		
		if(status.equals("success")) {
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
		else
		{
			return new ResponseEntity<String>(HttpStatus.BAD_GATEWAY);
		}
	}
	
	
	@PostMapping("/task")
	public ResponseEntity<?> editTask(@RequestBody TaskDto request){
		try {
//		String status=(taskService.addtask(task)!= null)?"success":"failed";
		
		response = taskService.editTask(request);
		
		return new ResponseEntity<Response>(response, HttpStatus.OK);

		}catch (Exception e) {
			
			response.setResponseType("F");
			response.setResponseValue("Exception");
			
			return new ResponseEntity<Response>(response, HttpStatus.BAD_GATEWAY);

			// TODO: handle exception
		}

	}
	
	@GetMapping("/task/{id}")
	public ResponseEntity<Response> deleteTask(@PathVariable int id){
		try {
			response= taskService.deleteTask(id);
			return new ResponseEntity<Response>(response,HttpStatus.ACCEPTED);
		}
		catch(Exception e) {
			response.setResponseType("f");
			response.setResponseValue("Exception");
			
			return new ResponseEntity<Response>(response, HttpStatus.BAD_REQUEST);
		}
		
//		

	}
	
	
	
	
	

}
