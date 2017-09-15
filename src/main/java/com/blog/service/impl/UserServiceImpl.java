package com.blog.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.blog.entity.User;
import com.blog.mapper.UserMapper;
import com.blog.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	public List<User> getAllUsers() {
		List<User> us = userMapper.getUsers();
		return us;
	}

	public void addUser(User u) {
		userMapper.addUser(u);
		
	}

}
