package com.blog.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

//import org.apache.shiro.SecurityUtils;
//import org.apache.shiro.authc.AuthenticationException;
//import org.apache.shiro.subject.Subject;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.blog.entity.User;


@EnableWebMvc
@Controller
@RequestMapping("/api")
public class LoginController {
	//private static Logger logger = LoggerFactory.getLogger(LoginController.class);

//	@Autowired
//	private UserInfoServiceImpl userServiceImpl;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public @ResponseBody String login(String user, Model model, HttpSession session, HttpServletResponse response) {
		return "login success";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public @ResponseBody List<User> toLogin(HttpServletResponse response) {
		List<User> us = new ArrayList<User>();
		User u = new User();
		u.setId("1234");
		u.setName("Name123");
		us.add(u);
		u = new User();
		u.setId("4321");
		u.setName("Name321111");
		us.add(u);
		return us;
		//response.setStatus(401);
		
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public @ResponseBody String logout() {
		return "logout success";
	}
 
}
