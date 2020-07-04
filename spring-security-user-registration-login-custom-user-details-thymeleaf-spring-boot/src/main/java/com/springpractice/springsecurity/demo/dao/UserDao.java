package com.springpractice.springsecurity.demo.dao;

import com.springpractice.springsecurity.demo.entity.User;

public interface UserDao {

    public User findByUserName(String userName);
    
    public void save(User user);
    
}
