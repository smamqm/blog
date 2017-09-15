package com.blog.service;

import java.util.List;

import com.blog.entity.User;

public interface UserService {

	List<User> getAllUsers();

	void addUser(User u);

}
