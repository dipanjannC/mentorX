package com.mentor.web.security.model;

public class AuthToken {

	private String token;
	private String username;
	private String usertype;
	private long userId;

	public AuthToken() {

	}


	public AuthToken(String token, String username, String usertype, long userId) {
		super();
		this.token = token;
		this.username = username;
		this.usertype = usertype;
		this.userId = userId;
	}



	public AuthToken(String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

}
