package com.cg.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Programs_Scheduled")
public class ProgramsScheduled {
	@Id
	@Column(name="Scheduled_program_id")
	private String ScheduledProgramId;
	
	@Column(name="ProgramName")
	private String programName;
	
	@Column(name="Location")
	private String location;
	
	
	@DateTimeFormat(pattern="dd-MMM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="start_date")
	private Date startDate;
	
	
	@DateTimeFormat(pattern="dd-MMM-yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="end_date")
	private Date endDate;
	
	@Column(name="session_per_week")
	private int sessionPerWeek;

	
	//Getters and Setters
	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	

	public int getSessionPerWeek() {
		return sessionPerWeek;
	}

	public void setSessionPerWeek(int sessionPerWeek) {
		this.sessionPerWeek = sessionPerWeek;
	}

	

	public String getScheduledProgramId() {
		return ScheduledProgramId;
	}

	public void setScheduledProgramId(String scheduledProgramId) {
		ScheduledProgramId = scheduledProgramId;
	}

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	

}
