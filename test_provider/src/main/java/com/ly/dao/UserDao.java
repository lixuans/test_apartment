package com.ly.dao;

import com.ly.bean.User;


import java.util.List;

public interface UserDao {
    public List<User> getUserList();
    public User getUserOne(String name);
    public User addUser(User user);
    public int deleteUser(String name);
}
