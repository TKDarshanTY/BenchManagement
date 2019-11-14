package com.tyss.benchmanage.dto;

import java.util.List;

public class UserResponse {

	private int statusCode;
	private String message;
	private String description;
	private User user1;
	private List<User> users;
	
	public List<User> getUsers() {
		return users;
	}
	public void setUsers(List<User> users) {
		this.users = users;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser1() {
		return user1;
	}
	public void setUser1(User user1) {
		this.user1 = user1;
	}
	
}
