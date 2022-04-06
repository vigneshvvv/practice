package com.stgit.timesheet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stgit.timesheet.entity.Member;
import com.stgit.timesheet.repository.MemberRepo;
import com.stgit.timesheet.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService {
	
	
	@Autowired
	MemberRepo memberRepo;
	
	public List<Member> getallmember(){
		return memberRepo.findAll();
	}
	
	public Member insertmember(Member member) {
		return memberRepo.save(member);
	}

}
