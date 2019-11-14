package com.tyss.benchmanage.dao;

import java.util.List;

import com.tyss.benchmanage.dto.User;

public interface UserDao {	

	public User register(User user);
	public User login(String email,String password);
	public List<User> getAll(String role);

}
