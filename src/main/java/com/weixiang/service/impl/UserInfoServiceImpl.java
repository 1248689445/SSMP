package com.weixiang.service.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.weixiang.dao.UserInfoMapper;
import com.weixiang.entity.UserInfo;
import com.weixiang.service.IUserInfoService;
import com.weixiang.utils.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfoServiceImpl extends ServiceImpl<UserInfoMapper, UserInfo> implements IUserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public String SelectUserInfoByUserId(Integer id) {
        if (id!=null){
            EntityWrapper<UserInfo> entityWrapper=new EntityWrapper();
            entityWrapper.eq("id",id);
            return JSON.toJSONString(userInfoMapper.selectList(entityWrapper));
        }
        return JSON.toJSONString(userInfoMapper.selectList(null));
    }


    public String InsertUserInfo(UserInfo userInfo) {

        if (userInfo!=null){
            if (userInfoMapper.insert(userInfo)>0){
                return JSONUtil.Success();
            }
        }
        return JSONUtil.NotNull();
    }


    public String UpdateUserInfo(UserInfo userInfo) {
        if (userInfo!=null&&userInfo.getUserId()!=null){
            EntityWrapper<UserInfo> entityWrapper=new EntityWrapper<UserInfo>();
            entityWrapper.eq("user_id",userInfo.getUserId());
            int i=userInfoMapper.update(userInfo,entityWrapper);
            if (i>0){
                return JSONUtil.Success();
            }
        }
        return JSONUtil.NotNull();
    }

    public String DeleteeUserInfo(Integer userId) {
        if (userId!=null){
            EntityWrapper<UserInfo> entityWrapper=new EntityWrapper<UserInfo>();
            entityWrapper.eq("user_id",userId);
           int i= userInfoMapper.delete(entityWrapper);
            if (i>0){
                return JSONUtil.Success();
            }
        }
        return JSONUtil.NotNull();
    }
}
