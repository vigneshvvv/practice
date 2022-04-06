package com.stgit.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stgit.timesheet.entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Integer> {

}
