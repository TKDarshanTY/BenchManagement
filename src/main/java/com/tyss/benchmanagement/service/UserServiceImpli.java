package com.tyss.benchmanagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tyss.benchmanagement.dao.UserDao;
import com.tyss.benchmanagement.dto.User;

@Service
public class UserServiceImpli implements UserService{

	@Autowired
	private UserDao dao;

	@Override
	public User register(User user) {
		return dao.register(user);
	}

	@Override
	public User login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public List<User> getAll(String role) {
		return dao.getAll(role);
	}

}
