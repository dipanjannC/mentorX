package com.mentor.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mentor.web.model.MentorSkills;
import com.mentor.web.repository.MentorSkillsRepository;

@Service
public class MentorServiceImpl implements MentorService {

	@Autowired
	public MentorSkillsRepository mentorSkillsRepository;

	@Override
	public List<MentorSkills> getAllSkills() {
		// TODO Auto-generated method stub

		List<MentorSkills> skills = new ArrayList<>();
		mentorSkillsRepository.findAll().forEach(skills::add);

		return skills;
	}

}
