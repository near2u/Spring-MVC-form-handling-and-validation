package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.dao.UserDao;
import com.project.model.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public List<User> getList(){
		return userDao.getList();
		
	}

	public void addNewUser(User user) {
		// TODO Auto-generated method stub
		userDao.addNewUser( user);
	}
}
