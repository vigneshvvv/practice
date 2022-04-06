package com.stgit.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stgit.timesheet.entity.Task;

public interface TaskRepo extends JpaRepository<Task,Integer> {

	
	
	Task findById( int id);
}
