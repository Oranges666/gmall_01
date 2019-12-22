package com.husay.gmall.user.mapper;

import com.husay.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/***
 @program: gmall_01* 
 @description: * 
 @author: hujiang* 
 @create: 2019-12-20 00:02
 **/
public interface UserMapper extends Mapper<UmsMember> {
    List<UmsMember> selectAllUser();
}
