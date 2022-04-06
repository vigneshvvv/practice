package com.stgit.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stgit.timesheet.entity.Role;

public interface RoleRepo extends JpaRepository<Role,Integer> {

}
