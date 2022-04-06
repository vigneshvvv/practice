package com.stgit.timesheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.stgit.timesheet.entity.Phase;
import com.stgit.timesheet.service.PhaseService;


@RestController
public class PhaseController {
	
	@Autowired
	PhaseService phaseService;
	
	@GetMapping("phase")
	public List<Phase> getallphase(){
		return phaseService.getallphase();
	}
	
	@PostMapping("phase")
	public ResponseEntity<String> insertphase(@RequestBody Phase phase) {
		
		String status=(phaseService.insertphase(phase) != null)? "success":"failed";
		
		if(status.equals("success")) {
			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
			
		}
		else
		{
			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
		}
		
		
	}
	
//	@DeleteMapping("phase/{id}")
//	public ResponseEntity<String> deletephase(@PathVariable Integer id) {
//		String status=(phaseService.deletePhase(id)!= null) ?  "success":"failed";
//		
//		if(status.equals("success")) {
//			return new ResponseEntity<String>(HttpStatus.ACCEPTED);
//		}
//		else
//		{
//			return new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
//		}
//	}

}
