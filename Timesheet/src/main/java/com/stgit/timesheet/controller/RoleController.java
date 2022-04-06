package com.stgit.timesheet.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stgit.timesheet.entity.Role;
import com.stgit.timesheet.service.RoleService;

@RestController
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	Logger logger= LoggerFactory.getLogger(getClass());
	
	@GetMapping("/role")
	public List<Role> getallrole(){
		return roleService.getrole();
	}
	
	@PostMapping("/role")
	public ResponseEntity<String> insertrole(@RequestBody Role role) {
		
		logger.info("the insert role was started");
		String status= (roleService.insertrole(role) != null) ? "success" : "failed";
		
		if(status.equals("success"))
		{
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
		else
		{
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		
	}

}
