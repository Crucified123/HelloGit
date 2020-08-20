package com.oracle.serviceImpl;

import com.oracle.mapper.UserMapper;
import com.oracle.entity.User;
import com.oracle.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login(String uname, String password) throws Exception {
        return userMapper.login(uname,password);
    }
}
