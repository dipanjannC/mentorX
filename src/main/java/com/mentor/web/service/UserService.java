package com.mentor.web.service;

import java.util.List;

import com.mentor.web.model.User;
import com.mentor.web.model.UserPojo;

public interface UserService {

	User save(UserPojo user);

	List<User> findAll();

	void delete(long userId);

	User findUser(String username);

	User findById(long userId);

	UserPojo update(UserPojo userPojo);
}
