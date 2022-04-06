package com.stgit.timesheet.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Phase")
public class Phase {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer phase_id;
	
	private String phaseName;

	
	@OneToMany(mappedBy="phase")
	private List<Timelog> timelog;
	
	@OneToMany(mappedBy="phase")
	private List<Task> task;
	
	

	public Phase() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Phase(Integer phase_id, String phaseName, List<Timelog> timelog, List<Task> task) {
		super();
		this.phase_id = phase_id;
		this.phaseName = phaseName;
		this.timelog = timelog;
		this.task = task;
	}

	public Integer getPhase_id() {
		return phase_id;
	}

	public void setPhase_id(Integer phase_id) {
		this.phase_id = phase_id;
	}

	public String getPhaseName() {
		return phaseName;
	}

	public void setPhaseName(String phaseName) {
		this.phaseName = phaseName;
	}

	public List<Timelog> getTimelog() {
		return timelog;
	}

	public void setTimelog(List<Timelog> timelog) {
		this.timelog = timelog;
	}

	public List<Task> getTask() {
		return task;
	}

	public void setTask(List<Task> task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "Phase [phase_id=" + phase_id + ", phaseName=" + phaseName + ", timelog=" + timelog + ", task=" + task
				+ "]";
	}
	
	
	

}
