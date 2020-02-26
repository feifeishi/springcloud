package com.feifeishi.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.feifeishi.dao.UserDao;
import com.feifeishi.entity.User;
import com.feifeishi.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public boolean addUser(User user) {
		boolean flag;
		flag = userDao.addUser(user);
		return flag;
	}

	@Override
	public User getUser(int id) {
		User user = userDao.getUser(id);
		System.out.println("provider微服务在响应客户端请求……");
		System.out.println("user : " + user);
		return user;
	}

	@Override
	public List<User> getUsers() {
		List<User> users = userDao.getUsers();
		return users;
	}

}