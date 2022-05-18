package com.volkruss.testspringf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.volkruss.testspringf.application.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public String home() {
		return "Welcome To Your App";
	}
	@GetMapping("/get/user")
	public String getUser() {
		String user = this.userService.findUser();
		return user;
	}
}
