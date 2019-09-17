package com.mentor.web.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.mentor.web.model.User;
import com.mentor.web.model.UserPojo;
import com.mentor.web.repository.UserRepository;

@Service
public class UserServiceImpl implements UserDetailsService, UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userRepository.findByEmail(email);
		if (user == null) {
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),
				getAuthority());
	}

	private List<SimpleGrantedAuthority> getAuthority() {
		return Arrays.asList(new SimpleGrantedAuthority("ROLE_ADMIN"));
	}

	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		userRepository.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	@Override
	public void delete(long userId) {
		userRepository.deleteById(userId);
	}

	@Override
	public User findUser(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public User findById(long id) {
		Optional<User> optionalUser = userRepository.findById(id);
		return optionalUser.isPresent() ? optionalUser.get() : null;
	}

	@Override
	public UserPojo update(UserPojo userPojo) {
		User user = findById(userPojo.getUserId());
		if (user != null) {
			BeanUtils.copyProperties(userPojo, user, "password");
			userRepository.save(user);
		}
		return userPojo;
	}

	@Override
	public User save(UserPojo user) {
		
		System.out.println("\n\n\n ENTERING SAVE \n\n\n");
		
		User newUser = new User();
		newUser.setActive(user.isActive());
		newUser.setEmail(user.getEmail());
		newUser.setFirstname(user.getFirstname());
		newUser.setLastname(user.getLastname());
		newUser.setPassword(bcryptEncoder.encode(user.getPassword()));
		newUser.setContact(user.getContact());
		newUser.setUsertype(user.getUsertype());
		System.out.println("\n\n\n\n successfully values setted \n\n\n\n\n");
		return userRepository.save(newUser);
	
	}
}
