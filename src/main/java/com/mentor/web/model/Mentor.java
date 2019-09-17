package com.mentor.web.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mentor")
public class Mentor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mentorId;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "linkedin_url")
	private String linkedinUrl;
	
	@Column(name = "reg_datetime")
	private Date regDateTime;
	
	@Column(name = "reg_code")
	private String regCode ;
	
	@Column(name = "active")
	private boolean active ;
	
	@Column(name = "year_of_experience")
	private int yearOfExperience ;
	
	@OneToMany
	private List<MentorSkills> mentorSkills;
	
	public Mentor() {
		
	}

	public Mentor(long mentorId, String username, String linkedinUrl, Date regDateTime, String regCode, boolean active,
			int yearOfExperience, List<MentorSkills> mentorSkills) {
		super();
		this.mentorId = mentorId;
		this.username = username;
		this.linkedinUrl = linkedinUrl;
		this.regDateTime = regDateTime;
		this.regCode = regCode;
		this.active = active;
		this.yearOfExperience = yearOfExperience;
		this.mentorSkills = mentorSkills;
	}




	public long getMentorId() {
		return mentorId;
	}
	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}


	public String getLinkedinUrl() {
		return linkedinUrl;
	}

	public void setLinkedinUrl(String linkedinUrl) {
		this.linkedinUrl = linkedinUrl;
	}

	public Date getRegDateTime() {
		return regDateTime;
	}

	public void setRegDateTime(Date regDateTime) {
		this.regDateTime = regDateTime;
	}

	public String getRegCode() {
		return regCode;
	}

	public void setRegCode(String regCode) {
		this.regCode = regCode;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getYearOfExperience() {
		return yearOfExperience;
	}

	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}

	public List<MentorSkills> getMentorSkills() {
		return mentorSkills;
	}

	public void setMentorSkills(List<MentorSkills> mentorSkills) {
		this.mentorSkills = mentorSkills;
	}

	@Override
	public String toString() {
		return "Mentor [mentorId=" + mentorId + ", username=" + username + ", linkedinUrl=" + linkedinUrl
				+ ", regDateTime=" + regDateTime + ", regCode=" + regCode + ", active=" + active + ", yearOfExperience="
				+ yearOfExperience + ", mentorSkills=" + mentorSkills + "]";
	}

	
}

