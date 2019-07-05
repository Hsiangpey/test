package com.it.service.impl;


import com.it.dao.IUserDao;
import com.it.entity.User;
import com.it.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private IUserDao userDao;

    public User findUserInfoByUserName(String userName) {
        System.out.println("调用了DAO");
        return userDao.findUserInfoByUserName(userName);
    }
}
