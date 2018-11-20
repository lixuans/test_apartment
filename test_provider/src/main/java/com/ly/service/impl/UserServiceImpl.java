package com.ly.service.impl;

import com.ly.bean.Response;
import com.ly.bean.User;
import com.ly.dao.UserDao;
import com.ly.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
//    public List<User> getUserList() {
//        return null;
//    }

    public Response getUserOne(String name) {
        Response response=new Response();
        try{
            User user= this.userDao.getUserOne(name);
            System.out.println(user.getName());
            response.setData(user);
            response.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
            response.setSuccess(false);
            response.setErrorCode("0001");
            response.setErrorMsg("查询用户发生异常");
        }
        return response;
    }

    public Response addUser(User user) {
        Response response=new Response();
        try{
            User user1= this.userDao.addUser(user);
            System.out.println(user.getName());
            response.setData(user);
            response.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
            response.setSuccess(false);
            response.setErrorCode("0001");
            response.setErrorMsg("添加用户发生异常");
        }
        return response;
    }
//
//    public int deleteUser(String name) {
//        return 0;
//    }
}
