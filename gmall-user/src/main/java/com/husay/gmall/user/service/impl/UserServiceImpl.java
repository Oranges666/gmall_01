package com.husay.gmall.user.service.impl;

import com.husay.gmall.user.mapper.UserMapper;
import com.husay.gmall.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/***
 @program: gmall_01* 
 @description: impl* 
 @author: hujiang* 
 @create: 2019-12-19 23:18
 **/
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    UserMapper userMapper;
}
