package com.prolifics.main.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="candidates")
public class Candidates {
	@Id
	@Column(name="mobile_number")
	private long mobileNumber;
	@Column(name="name")
	private String name;
	@Column(name="email")
	private String email;
	@Column(name="role")
	private String role;
	@Column(name="interview_date")
	@JsonFormat(shape=JsonFormat.Shape.STRING,pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)
	private Date interviewDate;
	public Candidates(long mobileNumber, String name, String email, String role, Date interviewDate) {
		super();
		this.mobileNumber = mobileNumber;
		this.name = name;
		this.email = email;
		this.role = role;
		this.interviewDate = interviewDate;
	}
	public Candidates(){
		
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Date getInterviewDate() {
		return interviewDate;
	}
	public void setInterviewDate(Date interviewDate) {
		this.interviewDate = interviewDate;
	}
	
}
