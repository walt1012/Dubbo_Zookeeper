package com.wushang.edu.web.controller.base;

import java.lang.reflect.ParameterizedType;

/**
 * @ClassName BaseController
 * @Description TODO
 * @Author wushang
 * @Date 2019-09-04 15:53
 */
public abstract class BaseController<T> {

	public static String MANAGE_PAGE;
	public static String INFO_PAGE;
	public static String EDIT_PAGE;
	public static String UPDATE_PAGE;


	public BaseController() {

		//1.获取泛型的真实类型
		ParameterizedType type = (ParameterizedType) this.getClass().getGenericSuperclass();

		Class<?> modelClass = (Class<?>) type.getActualTypeArguments()[0];

		//2.获取模块名
		String moduleName = modelClass.getSimpleName();

		//3.给静态页面赋值
		MANAGE_PAGE = moduleName + "/" + moduleName + "Manage";
		INFO_PAGE = moduleName + "/" + moduleName + "Info";
		EDIT_PAGE = moduleName + "/" + moduleName + "Edit";
		UPDATE_PAGE = moduleName + "/" + moduleName + "Update";

	}

}
