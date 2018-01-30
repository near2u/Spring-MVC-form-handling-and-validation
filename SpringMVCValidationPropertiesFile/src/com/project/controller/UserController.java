package com.project.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.project.model.UserBean;
import com.project.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	
	@RequestMapping(value="/", method= RequestMethod.GET)
	public String redirect(Model model) {
		model.addAttribute("user",new UserBean());
		return "register";
	}
	
	@RequestMapping(value="/registerSuccess", method= RequestMethod.POST)
	public String register(@Valid @ModelAttribute("user") UserBean user, BindingResult result) { 
			if(result.hasErrors()){
				return "register";
			}
			userService.addUser(user);
		return "redirect:/listUsers";
	}
	
	@RequestMapping(value="/listUsers", method=RequestMethod.GET)
	public ModelAndView listUsers() {
		List<UserBean> list = userService.getList();
		ModelAndView mav = new ModelAndView("success");
		mav.addObject("userList", list);
		return mav;
		
	}
}
