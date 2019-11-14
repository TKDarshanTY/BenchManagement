package com.tyss.benchmanagement.service;

import java.util.List;

import com.tyss.benchmanagement.dto.User;

public interface UserService {

	public User register(User user);
	public User login(String email,String password);
	public List<User> getAll(String role);
	
}
