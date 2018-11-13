package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Programs_Offered")
public class ProgramsOffered {
	@Id
	@Column(name="ProgramName")
	private String programName;
	
	@Column(name="description")
	private String description;
	
	@Column(name="applicant_eligiblity")
	private String applicantEligiblity;
	
	@Column(name="duration")
	private int duration;
	
	@Column(name="degree_certificate_offered")
	private String degreeCertificateOffered;
	
	//Getters and Setters

	public String getProgramName() {
		return programName;
	}

	public void setProgramName(String programName) {
		this.programName = programName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getApplicantEligiblity() {
		return applicantEligiblity;
	}

	public void setApplicantEligiblity(String applicantEligiblity) {
		this.applicantEligiblity = applicantEligiblity;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public String getDegreeCertificateOffered() {
		return degreeCertificateOffered;
	}

	public void setDegreeCertificateOffered(String degreeCertificateOffered) {
		this.degreeCertificateOffered = degreeCertificateOffered;
	}
	
	
	

}
