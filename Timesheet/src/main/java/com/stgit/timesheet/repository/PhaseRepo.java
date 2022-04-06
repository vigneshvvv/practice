package com.stgit.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stgit.timesheet.entity.Phase;

public interface PhaseRepo extends JpaRepository<Phase,Integer> {

}
