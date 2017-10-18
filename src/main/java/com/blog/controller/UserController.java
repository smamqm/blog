package com.blog.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.blog.entity.User;
import com.blog.service.UserService;

@EnableWebMvc
@Controller
@RequestMapping("/api")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/home/ulogin", method = RequestMethod.GET)
	public @ResponseBody List<User> toLogin(HttpServletResponse response) {
		List<User> us = userService.getAllUsers();
		return us;
	}
	
	@RequestMapping(value = "/home/update", method = RequestMethod.GET)
	public @ResponseBody List<User> toLogin() {
		User u = new User();
		u.setId("1234");
		u.setName("Name123");
		userService.addUser(u);
		return toLogin(null);
	}
	
}
