package com.oracle.service;

import com.oracle.entity.User;

public interface UserService {

    public User login(String uname, String password)throws Exception;


}
