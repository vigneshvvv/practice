package com.stgit.timesheet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stgit.timesheet.entity.Member;

public interface MemberRepo extends JpaRepository<Member,Integer> {

}
