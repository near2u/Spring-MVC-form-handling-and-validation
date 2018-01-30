package com.project.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.project.model.User;

@Repository
public class UserDao {
	
	static List<User> users = null;
	
	static{
		
		users = new ArrayList<User>();
		users.add(new User("Vishal", "visha@gmail.com", "India", 25));
		users.add(new User("Sharad", "sharad@gmail.com", "India", 25));
		users.add(new User("Sujit", "sujit@gmail.com", "India", 27));
		
		
	}
	
	public List<User> getList() {
		return users;
	}

	public void addNewUser(User user) {
		users.add(user);
		
	}
}
