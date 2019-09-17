package com.mentor.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mentor_skills")
public class MentorSkills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long mentorSkillId;
	
	@ManyToOne	
	@JoinColumn(name="mentorId")
	private Mentor mentor;
	
	public Mentor getMentor() {
		return mentor;
	}

	public void setMentor(Mentor mentor) {
		this.mentor = mentor;
	}
	
	@Column(name = "skill_id")
	private long skillId;
	
	@Column(name = "skill_name")
	private String skillName;
	
	@Column(name = "self_rating")
	private float selfRating;
	
	@Column(name = "years_of_exp")
	private int yearsOfExp;
	
	@Column(name = "trainings_delivered")
	private String trainingsDelivered;
	
	@Column(name = "facilities_offered")
	private String facilitiesOffered;

	public MentorSkills() {
		
	}
	
	public MentorSkills(long mentorSkillId, Mentor mentor, long skillId, String skillName, float selfRating, int yearsOfExp,
			String trainingsDelivered, String facilitiesOffered) {
		super();
		this.mentorSkillId = mentorSkillId;
		this.mentor = mentor;
		this.skillId = skillId;
		this.skillName = skillName;
		this.selfRating = selfRating;
		this.yearsOfExp = yearsOfExp;
		this.trainingsDelivered = trainingsDelivered;
		this.facilitiesOffered = facilitiesOffered;
	}

	@Override
	public String toString() {
		return "MentorSkills [mentorSkillId=" + mentorSkillId + ", mentor=" + mentor + ", skillId=" + skillId + ", skillName=" + skillName
				+ ", selfRating=" + selfRating + ", yearsOfExp=" + yearsOfExp + ", trainingsDelivered="
				+ trainingsDelivered + ", facilitiesOffered=" + facilitiesOffered + "]";
	}
	
	
}
