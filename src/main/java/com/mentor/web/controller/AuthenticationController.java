package com.mentor.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.*;

import com.mentor.web.model.User;
import com.mentor.web.security.config.JwtTokenUtil;
import com.mentor.web.security.model.ApiResponse;
import com.mentor.web.security.model.AuthToken;
import com.mentor.web.security.model.LoginUser;
import com.mentor.web.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 36000)
@RestController
@RequestMapping("/login")
public class AuthenticationController {

	/*
	 * To Access from Zuul API Gateway
	 * http://localhost:8989/mentorX/login
	 */

	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private JwtTokenUtil jwtTokenUtil;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/generate-token", method = RequestMethod.POST)
	public ApiResponse<AuthToken> register(@RequestBody LoginUser loginUser) throws AuthenticationException {

		authenticationManager
				.authenticate(new UsernamePasswordAuthenticationToken(loginUser.getEmail(), loginUser.getPassword()));
		final User user = userService.findUser(loginUser.getEmail());
		final String token = jwtTokenUtil.generateToken(user);

		return new ApiResponse<>(200, "success",
				new AuthToken(token, user.getEmail(), user.getUsertype(), user.getUserId()));
	}

}
