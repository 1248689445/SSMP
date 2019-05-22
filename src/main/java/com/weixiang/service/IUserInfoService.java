package com.weixiang.service;

import com.baomidou.mybatisplus.service.IService;
import com.weixiang.entity.UserInfo;


public interface IUserInfoService extends IService<UserInfo> {

    //传入一个userId查询UserInfo中的数据
    String SelectUserInfoByUserId(Integer userId);

    //传入一个UserInfo对象插入对应的值
    String InsertUserInfo(UserInfo userInfo);

    //传入一个UserInfo对象修改对应userId的值
    String UpdateUserInfo(UserInfo userInfo);

    //传入一个userId对象删除对应的数据
    String DeleteeUserInfo(Integer userId);
}
