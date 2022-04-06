package com.stgit.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stgit.timesheet.entity.Phase;
import com.stgit.timesheet.entity.Timelog;

public interface TimelogRepo extends JpaRepository<Timelog,Integer> {

}
