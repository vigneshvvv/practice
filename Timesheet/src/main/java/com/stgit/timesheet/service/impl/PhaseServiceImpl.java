package com.stgit.timesheet.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.stgit.timesheet.entity.Phase;
import com.stgit.timesheet.repository.PhaseRepo;
import com.stgit.timesheet.service.PhaseService;
@Service
public class  PhaseServiceImpl implements PhaseService {
	
	
	@Autowired
	PhaseRepo phaseRepo;
	
	
	public List<Phase> getallphase(){
		return phaseRepo.findAll();
	}
	
	public Phase insertphase(Phase phase) {
		return phaseRepo.save(phase);
	}

	@Override
	public void deletePhase(int id) {
		 phaseRepo.deleteById(id);
		 
	}
	
	

}
