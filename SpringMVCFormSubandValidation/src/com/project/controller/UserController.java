package com.project.controller;

import java.util.List;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.User;
import com.project.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService  userService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String redirect(Model model) {
		model.addAttribute(new User());
		return "register";
	}
	
	@RequestMapping(value="/registerUser", method=RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result) {
		if(result.hasErrors()){
			return "register";
		}
		userService.addNewUser(user);
			
		return "redirect:/listUser";
	}
	
	@RequestMapping(value="/listUser")
	public ModelAndView listUsers(ModelAndView modelAndView){
		
		modelAndView.setViewName("success");
		List<User> listUser = userService.getList();
		modelAndView.addObject("userList", listUser);
		return modelAndView;
	}
}
