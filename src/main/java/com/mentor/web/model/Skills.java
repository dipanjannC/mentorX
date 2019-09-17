package com.mentor.web.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "skills")
public class Skills {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long skillId;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "TOC")
	private String TOC;
	
	@Column(name = "duration")
	private Date duration;
	
	@Column(name = "prerequites")
	private String prerequites;
	
	public Skills(){
		
	}

	public Skills(long skillId, String name, String tOC, Date duration, String prerequites) {
		super();
		this.skillId = skillId;
		this.name = name;
		TOC = tOC;
		this.duration = duration;
		this.prerequites = prerequites;
	}

	public long getSkillId() {
		return skillId;
	}

	public void setSkillId(long skillId) {
		this.skillId = skillId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTOC() {
		return TOC;
	}

	public void setTOC(String tOC) {
		TOC = tOC;
	}

	public Date getDuration() {
		return duration;
	}

	public void setDuration(Date duration) {
		this.duration = duration;
	}

	public String getPrerequites() {
		return prerequites;
	}

	public void setPrerequites(String prerequites) {
		this.prerequites = prerequites;
	}

	@Override
	public String toString() {
		return "Skills [skillId=" + skillId + ", name=" + name + ", TOC=" + TOC + ", duration=" + duration
				+ ", prerequites=" + prerequites + "]";
	}
	
	

}
