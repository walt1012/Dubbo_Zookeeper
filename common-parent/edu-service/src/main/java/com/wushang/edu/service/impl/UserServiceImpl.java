package com.wushang.edu.service.impl;

import com.wushang.edu.model.User;
import com.wushang.edu.service.IUserService;
import com.wushang.edu.service.base.BaseServiceImpl;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName UserServiceImpl
 * @Description TODO
 * @Author wushang
 * @Date 2019-09-04 12:34
 */

@Service
@Transactional
public class UserServiceImpl extends BaseServiceImpl<User> implements IUserService {
	@Override
	public User login(String username, String password) {
		return null;
	}

	@Override
	public User findById(Integer id) {
		User user = userMapper.findById(id);
		return user;
	}

	@Override
	public User findByUUId(String uuid) {
		return null;
	}

	@Override
	public void deleteById(Integer id) {

	}

	@Override
	public void deleteByUUId(String uuid) {

	}

	@Override
	public void update(User user) {

	}

	@Override
	public void insert(User user) {

	}
}
