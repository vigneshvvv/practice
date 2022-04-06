package com.stgit.timesheet.entity;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="timelog")
@Getter
@Setter
public class Timelog {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	
	private Date date;
	private LocalTime hours;
	private Boolean approvalstatus;
	
	@ManyToOne
	private Task task;
	
	@ManyToOne
	private Phase phase;
	
	@ManyToOne
	private Member member;
	


}
