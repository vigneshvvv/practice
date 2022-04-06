package com.stgit.timesheet.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stgit.timesheet.entity.Member;
import com.stgit.timesheet.entity.Role;

@RestController
public class Demo {
	
	@GetMapping(value = "hello")
	public Member getMember()
	{
		return new Member();
	}
	
	@GetMapping(value = "world")
	public Role getRole()
	{
		return new Role();
	}

}
