package com.wushang.edu.service;

import com.wushang.edu.model.User;
import com.wushang.edu.service.base.IBaseService;

public interface IUserService extends IBaseService<User> {

	public User login(String username,String password);
}
