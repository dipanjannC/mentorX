package com.mentor.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mentor.web.model.User;
import com.mentor.web.model.UserPojo;
import com.mentor.web.security.model.ApiResponse;
import com.mentor.web.service.UserService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 36000)
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;


	@PostMapping
	public ApiResponse<User> saveUser(@RequestBody UserPojo user) {
		return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.", userService.save(user));
	}

	@GetMapping
	public ApiResponse<List<User>> listAllUser() {
		return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.", userService.findAll());
	}

	@GetMapping("/{userId}")
	public ApiResponse<User> getUser(@PathVariable int userId) {
		return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.", userService.findById(userId));
	}

	@PutMapping("/{userId}")
	public ApiResponse<UserPojo> updateUser(@RequestBody UserPojo user) {
		return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.", userService.update(user));
	}

	@DeleteMapping("/{userId}")
	public ApiResponse<Void> deleteUser(@PathVariable int userId) {
		userService.delete(userId);
		return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
	}

}
