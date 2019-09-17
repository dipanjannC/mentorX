package com.mentor.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.web.model.User;
import com.mentor.web.model.UserPojo;
import com.mentor.web.service.UserService;


@CrossOrigin(origins = "http://localhost:4200",maxAge = 36000)
@RestController
@RequestMapping("/signup")
public class RegistrationController {

	@Autowired
	private UserService userService;

	@PostMapping
	public User registerUser(@RequestBody UserPojo user) {
		System.out.println("\n\n\n hi \n\n\n");
		System.out.println("User value : " + user.getFirstname());
		return userService.save(user);

	}

}
