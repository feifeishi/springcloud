package com.feifeishi.service;

import java.util.List;

import com.feifeishi.entity.User;

public interface UserService {
	
	public boolean addUser(User user);
	
	public User getUser(int id);
	
	public List<User> getUsers();
}