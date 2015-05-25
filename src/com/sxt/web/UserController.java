package com.sxt.web;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sxt.service.UserService;

@Controller("userController")
@RequestMapping("/user.do")
public class UserController {

	@Resource
	private UserService userService;

	@RequestMapping(params = "method=reg")
	public String reg(String uname) {
		System.out.println("HelloController.handleRequest()");
		userService.add(uname);
		return "index";
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

}