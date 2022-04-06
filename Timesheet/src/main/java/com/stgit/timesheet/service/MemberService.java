package com.stgit.timesheet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.stgit.timesheet.entity.Member;


public interface MemberService {
	
	public List<Member> getallmember();
	
	public Member insertmember(Member member);

}
