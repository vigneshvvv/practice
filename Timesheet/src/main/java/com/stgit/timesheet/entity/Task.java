package com.stgit.timesheet.entity;

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

@Entity
@Table(name="Task")
@Getter
@Setter
public class Task {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer task_id;
	
	private String taskName;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	
	@OneToMany(mappedBy="task")
	private List<Timelog> timelog;
	
	@ManyToMany 
	private List<Project> project;
	
	@ManyToOne
	private Phase phase;

 
}
