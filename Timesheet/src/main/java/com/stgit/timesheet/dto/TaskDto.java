package com.stgit.timesheet.dto;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

public class TaskDto {
	
	private Integer task_id;
	private String taskName;
	public Integer getTask_id() {
		return task_id;
	}
	/**
	 * @param task_id the task_id to set
	 */
	public void setTask_id(Integer task_id) {
		this.task_id = task_id;
	}
	/**
	 * @return the taskName
	 */
	public String getTaskName() {
		return taskName;
	}
	/**
	 * @param taskName the taskName to set
	 */
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	
	
	
	
	
//	private Date createdDate;
//	private String createdBy;
//	private Date modifiedDate;
//	private String modifiedBy;
	
	
	
//	private List<Timelog> timelog;
	
//	private List<Project> project;
	
//	private Phase phase;

 
}
