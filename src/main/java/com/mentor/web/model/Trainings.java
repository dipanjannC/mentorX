package com.mentor.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "trainings")
public class Trainings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long trainingId;
	
	@Column(name = "user_id")
	private long userId;
	
	@Column(name = "mentor_id")
	private long mentorId;
	
	@Column(name = "skill_id")
	private long skillId;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "progress")
	private double progress;
	
	@Column(name = "rating")
	private int rating;
	
	@JsonFormat(pattern = "HH:mm:ss")
	@Column(name = "start_time")
	private String startTime;
	
	@JsonFormat(pattern = "HH:mm:ss")
	@Column(name = "end_time")
	private String endTime;
	
	@Column(name = "start_date")
	private Date startDate;
	
	@Column(name = "end_date")
	private Date endDate;
	
	@Column(name = "amount_received")
	private double amountReceived;
	
	@Column(name = "fees")
	private float fees;
	
	@Column(name = "user_name")
	private String username;
	
	@Column(name = "mentor_name")
	private String mentorName;
	
	@Column(name = "skill_name")
	private String skillName;

	public Trainings() {

	}

	public Trainings(long trainingId, long userId, long mentorId, long skillId, String status, double progress,
			int rating, String startTime, String endTime, Date startDate, Date endDate, double amountReceived,
			float fees, String username, String mentorName, String skillName) {
		super();
		this.trainingId = trainingId;
		this.userId = userId;
		this.mentorId = mentorId;
		this.skillId = skillId;
		this.status = status;
		this.progress = progress;
		this.rating = rating;
		this.startTime = startTime;
		this.endTime = endTime;
		this.startDate = startDate;
		this.endDate = endDate;
		this.amountReceived = amountReceived;
		this.fees = fees;
		this.username = username;
		this.mentorName = mentorName;
		this.skillName = skillName;
	}

	public long getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(long trainingId) {
		this.trainingId = trainingId;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public long getMentorId() {
		return mentorId;
	}

	public void setMentorId(long mentorId) {
		this.mentorId = mentorId;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getProgress() {
		return progress;
	}

	public void setProgress(double progress) {
		this.progress = progress;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
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

	public double getAmountReceived() {
		return amountReceived;
	}

	public void setAmountReceived(double amountReceived) {
		this.amountReceived = amountReceived;
	}

	public float getFees() {
		return fees;
	}

	public void setFees(float fees) {
		this.fees = fees;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getMentorName() {
		return mentorName;
	}

	public void setMentorName(String mentorName) {
		this.mentorName = mentorName;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	@Override
	public String toString() {
		return "Trainings [trainingId=" + trainingId + ", userId=" + userId + ", mentorId=" + mentorId + ", skillId="
				+ skillId + ", status=" + status + ", progress=" + progress + ", rating=" + rating + ", startTime="
				+ startTime + ", endTime=" + endTime + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", amountReceived=" + amountReceived + ", fees=" + fees + ", username=" + username + ", mentorName="
				+ mentorName + ", skillName=" + skillName + "]";
	}


}
