package com.mentor.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.web.model.MentorSkills;
import com.mentor.web.service.MentorService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 36000)
@RestController
public class MentorController {

	@Autowired
	private MentorService mentorService;
	
	@GetMapping("/skills/getAllskill")
	public List<MentorSkills> getAllSkills()
	{
		return mentorService.getAllSkills();
	}
}
