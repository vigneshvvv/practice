package com.stgit.timesheet.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stgit.timesheet.entity.Member;
import com.stgit.timesheet.service.MemberService;


@RestController
public class MemberController {
	
	@Autowired
	MemberService memberService;
	
	Logger logger= LoggerFactory.getLogger(getClass());
	
	@GetMapping("member")
	public List<Member> getallmember(){
		
		return memberService.getallmember();	
		
	}
	
	@PostMapping("member")
	public ResponseEntity<String> insertmember(@RequestBody Member member){
		
		logger.info("the insertion of member was started");
		
		String status= (memberService.insertmember(member)!= null)? "success" : "failed";
		
		if(status.equals("success")) {
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
		}
		else
		{
			return new ResponseEntity<String> (HttpStatus.BAD_REQUEST);
		}
	}

}
