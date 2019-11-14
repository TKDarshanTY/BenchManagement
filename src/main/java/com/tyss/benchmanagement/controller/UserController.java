package com.tyss.benchmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tyss.benchmanage.dto.User;
import com.tyss.benchmanage.dto.UserResponse;
import com.tyss.benchmanage.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping(path="/user",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse registerUser(@RequestBody User user) {
		UserResponse response=new UserResponse();
		User user1=service.register(user);
		if(user1!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("data added successfully");
			response.setUser1(user1);
			return response;
		}else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not added");
			return response;
		}
	}
	
	@PostMapping(path="/user",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse login(@PathVariable("email") String email, @PathVariable("password") String password) {
		UserResponse response=new UserResponse();
		User user1=service.login(email, password);
		if(user1!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Login successfully");
			response.setUser1(user1);
			return response;
		}else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("Unsuccess Login");
			return response;
		}
	}
	@PostMapping(path="/user",produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserResponse getAllByRole(@PathVariable("role") String role) {
		UserResponse response=new UserResponse();
		List<User> user1=service.getAll(role);
		if(user1!=null) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("data added successfully");
			response.setUsers(user1);
			return response;
		}else {
			response.setStatusCode(400);
			response.setMessage("failure");
			response.setDescription("data not added");
			return response;
		}
	}
}
