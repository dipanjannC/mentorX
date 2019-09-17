package com.mentor.web.security.model;

public class LoginUser {

	private String email;
	private String password;
	private String usertype;

	public String getUsertype() {
		return usertype;
	}

	public void setUserType(String usertype) {
		this.usertype = usertype;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
