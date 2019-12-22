package com.husay.gmall.user.service.impl;

import com.husay.gmall.user.bean.UmsMember;
import com.husay.gmall.user.mapper.UserMapper;
import com.husay.gmall.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public List<UmsMember> getAllUser() {

        //List<UmsMembers> umsMembersList = userMapper.selectAllUser();
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;
    }
}
