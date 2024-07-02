package com.restapi.demoApi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.demoApi.entity.UserData;
import com.restapi.demoApi.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("getUserData/{id}")
	public UserData getUserById(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
}
