package com.husay.gmall.user.service.impl;

import com.husay.gmall.user.bean.UmsMember;
import com.husay.gmall.user.bean.UmsMemberReceiveAddress;
import com.husay.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.husay.gmall.user.mapper.UserMapper;
import com.husay.gmall.user.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

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

    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {

        //List<UmsMembers> umsMembersList = userMapper.selectAllUser();
        List<UmsMember> umsMemberList = userMapper.selectAll();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId) {

        /*Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);*/
        UmsMemberReceiveAddress umsMemberReceiveAddress = new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(memberId);

        //List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.selectByExample(umsMemberReceiveAddress);

        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);

        return umsMemberReceiveAddressList;
    }
}
