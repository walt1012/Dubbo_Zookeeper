package com.wushang.edu.mapper;


import com.wushang.edu.model.User;
import com.wushang.edu.model.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    int updateByPrimaryKey(User record);
}