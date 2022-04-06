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
@Table(name="autoleave")
@Getter
@Setter
public class Autoleave {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer id;
	
	
	private Date date;
    private Boolean leaveReversed;
    
  
	
	@ManyToOne
	private Member member;
	


}
