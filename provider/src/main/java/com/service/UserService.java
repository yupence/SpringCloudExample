package com.service;


import com.dao.UserDao;
import com.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User queryById(Long id){
        return userDao.selectByPrimaryKey(id);
    }
}