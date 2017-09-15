package com.blog.mapper;

import java.util.List;

import com.blog.entity.User;

public interface UserMapper {
	public List<User> getUsers();

	public void addUser(User u);
}
