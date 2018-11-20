package com.ly.service;

import com.ly.bean.Response;
import com.ly.bean.User;

import java.util.List;

public interface UserService {
//    public List<User> getUserList();
    public Response getUserOne(String name);
//    public int addUser(User user);
//    public int deleteUser(String name);
}
