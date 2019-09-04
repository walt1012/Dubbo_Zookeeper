package com.wushang.edu.service.base;

import com.wushang.edu.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @ClassName BaseServiceImpl
 * @Description TODO
 * @Author wushang
 * @Date 2019-09-04 12:30
 */
public abstract class BaseServiceImpl<T> implements IBaseService<T> {

	//统一管理dao
	@Autowired
	protected UserMapper userMapper;

}
