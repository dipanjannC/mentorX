package com.mentor.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mentorCalender")
public class MentorCalender {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mentorCalenderId;
	
	@Column(name = "mentor_id")
	private long menotrId;
	
	@Column(name = "start_time")
	private String startTime;
	
	@Column(name = "end_time")
	private String endTime;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;

	public MentorCalender() {
		
	}

	public MentorCalender(long mentorCalenderId, long menotrId, String startTime, String endTime, Date startDate,
			Date endDate) {
		super();
		this.mentorCalenderId = mentorCalenderId;
		this.menotrId = menotrId;
		this.startTime = startTime;
		this.endTime = endTime;
		this.startDate = startDate;
		this.endDate = endDate;
	}

	public long getMentorCalenderId() {
		return mentorCalenderId;
	}

	public void setMentorCalenderId(long mentorCalenderId) {
		this.mentorCalenderId = mentorCalenderId;
	}

	public long getMenotrId() {
		return menotrId;
	}

	public void setMenotrId(long menotrId) {
		this.menotrId = menotrId;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "MentorCalender [mentorCalenderId=" + mentorCalenderId + ", menotrId=" + menotrId + ", startTime="
				+ startTime + ", endTime=" + endTime + ", startDate=" + startDate + ", endDate=" + endDate + "]";
	}
	
	
	
	
}
