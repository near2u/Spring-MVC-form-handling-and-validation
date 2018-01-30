package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserDao;
import com.project.model.UserBean;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public void addUser(UserBean user) {
		userDao.addUser(user);
		
	}

	public List<UserBean> getList() {
		// TODO Auto-generated method stub
		return userDao.getUserList();
	}

	
}
