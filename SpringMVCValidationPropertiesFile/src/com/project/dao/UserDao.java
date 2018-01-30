package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.model.UserBean;

@Repository
public class UserDao {
	
	static List<UserBean> list = null;
	
	static{
		
		list = new ArrayList<UserBean>();
		list.add(new UserBean("vishall", 25, "vishal@gmail.com", "India"));
		list.add(new UserBean("sharad", 25, "sharad@gmail.com", "India"));
		list.add(new UserBean("sujit", 25, "sujit@gmail.com", "India"));
		
		
	}
	
	public void addUser(UserBean user) {
		// TODO Auto-generated method stub
		list.add(user);
		
	}

	public List<UserBean> getUserList() {
		// TODO Auto-generated method stub
		return list;
	}

	
}
