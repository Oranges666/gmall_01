package com.husay.gmall.user.service;

import com.husay.gmall.user.bean.UmsMember;
import com.husay.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

/*** 
 @program: gmall_01* 
 @description: * 
 @author: hujiang* 
 @create: 2019-12-19 23:17
 **/
public interface IUserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getUmsMemberReceiveAddressByMemberId(String memberId);
}
