package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;

@RestController
public class UserController {

	@Autowired
	private User user;

	@RequestMapping(value = "/getUser", method = RequestMethod.GET)
	public User getUser() {
		return user;
	}
}
