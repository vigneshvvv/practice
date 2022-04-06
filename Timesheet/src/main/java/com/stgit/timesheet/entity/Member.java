package com.stgit.timesheet.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="member")

public class Member {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer member_id;
	
	private String memberName;
	private Date createdDate;
	private String createdBy;
	private Date modifiedDate;
	private String modifiedBy;
	
	@ManyToOne
	private Role role;
	
	@OneToMany(mappedBy="member")
	private List<Timelog> timelog;
	
	@OneToMany(mappedBy="member")
	private List<Autoleave> autoleave;
	
	@ManyToMany
	private List<Project> project;

	public Integer getMember_id() {
		return member_id;
	}

	public void setMember_id(Integer member_id) {
		this.member_id = member_id;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Timelog> getTimelog() {
		return timelog;
	}

	public void setTimelog(List<Timelog> timelog) {
		this.timelog = timelog;
	}

	public List<Autoleave> getAutoleave() {
		return autoleave;
	}

	public void setAutoleave(List<Autoleave> autoleave) {
		this.autoleave = autoleave;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	@Override
	public String toString() {
		return "Member [member_id=" + member_id + ", memberName=" + memberName + ", createdDate=" + createdDate
				+ ", createdBy=" + createdBy + ", modifiedDate=" + modifiedDate + ", modifiedBy=" + modifiedBy
				+ ", role=" + role + ", timelog=" + timelog + ", autoleave=" + autoleave + ", project=" + project + "]";
	}
	
	
	



}
