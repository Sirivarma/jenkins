package com.cg.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Application {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Application_id")
	private int applicationId;
	
	//@Pattern(regexp="^[A-Za-z][A-Za-z ]+{3,30}$",message="Only aphabets are allowed ") 
	@Column(name="full_name")
	//@NotNull(message="Name should not be empty")
	private String fullName;
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	//@ScriptAssert(lang = "javascript", script = "_this.startDate.before(_this.endDate)")
	//@NotNull(message="Please enter a date")      
	//@Past (message="Only the past is valid") 
	@DateTimeFormat(pattern="dd-MMM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="date_of_birth")
	private Date dateOfBirth;
	
	@Column(name="highet_qualification")
	//@NotNull(message="highet qualification should not be empty")
	private String highestQualification;
	
	@Column(name="marks_obtained")
	//@NotNull(message="marks obtained should not be empty")
	private int marksObtained;
	
	@Column(name="goals")
	//@NotNull(message="goals should not be empty")
	private String goals;
	
	@Column(name="email_id")
	//@NotNull(message="email id should not be empty")
	private String emailId;
	
	@Column(name="Scheduled_program_id")
	//@NotNull(message="Scheduled program id should not be empty")
	private String ScheduledProgramId;
	
	@Column(name="status")
	//@NotNull(message="status should not be empty")
	private String status;
	
	/*
	@DateTimeFormat(pattern="dd-MMM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="Date_Of_Interview")
	private Date dateOfInterview;
	*/
	//Getters and Setters

	public int getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(int applicationId) {
		this.applicationId = applicationId;
	}

	

	

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public int getMarksObtained() {
		return marksObtained;
	}

	public void setMarksObtained(int marksObtained) {
		this.marksObtained = marksObtained;
	}

	public String getGoals() {
		return goals;
	}

	public void setGoals(String goals) {
		this.goals = goals;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getScheduledProgramId() {
		return ScheduledProgramId;
	}

	public void setScheduledProgramId(String scheduledProgramId) {
		ScheduledProgramId = scheduledProgramId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*public Date getDateOfInterview() {
		return dateOfInterview;
	}

	public void setDateOfInterview(Date dateOfInterview) {
		this.dateOfInterview = dateOfInterview;
	}
	
	*/
	
}