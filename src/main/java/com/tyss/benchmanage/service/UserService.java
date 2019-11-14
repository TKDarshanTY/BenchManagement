package com.tyss.benchmanage.service;

import java.util.List;

import com.tyss.benchmanage.dto.User;

public interface UserService {

	public User register(User user);
	public User login(String email,String password);
	public List<User> getAll(String role);
	
}
