package com.stgit.timesheet.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="Projects")
@Getter
@Setter
public class Project {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer project_id;
	
	private String projectName;
	
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	
//	@ManyToMany(fetch= FetchType.LAZY, mappedBy="member")
//	@JoinColumn(name="memberId")
//	private List<Member> member;
	
	@ManyToMany
	@JoinTable(name="project_task", joinColumns = @JoinColumn(name="project_id"), inverseJoinColumns= @JoinColumn(name="task_id"))
	private List<Task> task;
	
	@ManyToMany
	@JoinTable(name="project_member", joinColumns= @JoinColumn(name="project_id"), inverseJoinColumns= @JoinColumn(name="member_id"))
	private List<Member> member;

	
	
	
	

}
