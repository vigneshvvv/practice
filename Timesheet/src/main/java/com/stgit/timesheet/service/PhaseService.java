package com.stgit.timesheet.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.stgit.timesheet.entity.Phase;

public interface PhaseService {
	
	public List<Phase> getallphase();
	
	public Phase insertphase(Phase phase);
	
	public void deletePhase(int id);

}
