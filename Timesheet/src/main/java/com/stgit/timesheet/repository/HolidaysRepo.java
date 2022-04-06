package com.stgit.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stgit.timesheet.entity.Holidays;

public interface HolidaysRepo extends JpaRepository<Holidays,Integer> {

}
