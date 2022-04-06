package com.stgit.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stgit.timesheet.entity.Autoleave;

public interface AutoleaveRepo  extends JpaRepository<Autoleave,Integer>{

}
