package com.wushang.edu.model;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.id
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.username
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.password
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_user.emp_id
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    private Integer empId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.id
     *
     * @return the value of t_user.id
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.id
     *
     * @param id the value for t_user.id
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.username
     *
     * @return the value of t_user.username
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.username
     *
     * @param username the value for t_user.username
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.password
     *
     * @return the value of t_user.password
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.password
     *
     * @param password the value for t_user.password
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_user.emp_id
     *
     * @return the value of t_user.emp_id
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_user.emp_id
     *
     * @param empId the value for t_user.emp_id
     *
     * @mbggenerated Mon Jun 04 22:04:46 CST 2018
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}