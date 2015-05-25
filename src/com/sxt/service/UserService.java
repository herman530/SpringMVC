package com.sxt.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.sxt.dao.UserDao;
import com.sxt.po.UserInfo;

@Service("userService")
public class UserService {
	@Resource
	private UserDao userDao;

	public void add(String uname) {
		System.out.println("UserService.add()");
		UserInfo u = new UserInfo();
		u.setUname(uname);
		userDao.add(u);
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

}