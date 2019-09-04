package com.wushang.edu.mapper.base;

/**
 * @ClassName BaseMapper
 * @Description TODO
 * @Author wushang
 * @Date 2019-09-04 11:31
 */
public interface BaseMapper<T> {

	public T findById(Integer id);

	public T findByUUId(String uuid);

	public void deleteById(Integer id);

	public void deleteByUUId(String uuid);

	public void update(T t);

	public void insert(T t);
}
