package com.stgit.timesheet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stgit.timesheet.entity.Role;
import com.stgit.timesheet.repository.RoleRepo;
import com.stgit.timesheet.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {
	
	@Autowired
	RoleRepo roleRepo;
	
	public List<Role> getrole(){
		
		return roleRepo.findAll();
		
	}
	
	public Role insertrole(Role role) {
		return roleRepo.save(role);
		
	}

	
}
