package com.husay.gmall.service;

import com.husay.gmall.beans.UmsMember;
import com.husay.gmall.beans.UmsMemberReceiveAddress;

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
