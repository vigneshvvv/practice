package com.stgit.timesheet.service;

import java.util.List;

import com.stgit.timesheet.entity.Role;

public interface RoleService {
	
	public List<Role> getrole();
	
	public Role insertrole(Role role);

}
