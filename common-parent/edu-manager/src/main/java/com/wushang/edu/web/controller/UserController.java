package com.wushang.edu.web.controller;

import com.wushang.edu.model.User;
import com.wushang.edu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author wushang
 * @Date 2019-09-04 11:03
 */

@Controller
@RequestMapping("user")
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping("login")
	public String login() {
		System.out.println("....");
		return "Default";
	}

	@RequestMapping("manage")
	public String manage(){
		return "User/UserManage";
	}

	@RequestMapping("info")
	public String info(){
		return "User/UserInfo";
	}

	@RequestMapping("edit")
	public String edit(){
		return "User/UserEdit";
	}

	@RequestMapping("update")
	public String update(){
		return "User/UserUpdate";
	}

	@RequestMapping("find")
	public String find(Integer id) {
		System.out.println("....");

		User user = userService.findById(id);
		System.out.println(user);

		return null;
	}
}
