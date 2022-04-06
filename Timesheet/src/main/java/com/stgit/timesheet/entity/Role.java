package com.stgit.timesheet.entity;

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
@Table(name= "Role")

public class Role {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer roleid;
	
	private String roleName;
	
	@OneToMany(mappedBy="role")
	private List<Member> member;


	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(Integer roleid, String roleName, List<Member> member) {
		super();
		this.roleid = roleid;
		this.roleName = roleName;
		this.member = member;
	}

	public Integer getRoleid() {
		return roleid;
	}

	public void setRoleid(Integer roleid) {
		this.roleid = roleid;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public List<Member> getMember() {
		return member;
	}

	public void setMember(List<Member> member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", roleName=" + roleName + ", member=" + member + "]";
	}
	    
	

	
	
	

	

}
