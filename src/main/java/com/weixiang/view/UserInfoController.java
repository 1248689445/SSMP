package com.weixiang.view;

import com.weixiang.entity.UserInfo;
import com.weixiang.service.IUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserInfoController {

    @Autowired
    private IUserInfoService iUserInfoService;

    /*
    根据id查出对应的值，如果不传参则查询全部的数据
     */
    @RequestMapping(value = "/select", produces = "text/html;charset=utf-8",method = RequestMethod.GET)
    @ResponseBody
    public String select(Integer id) {
        return iUserInfoService.SelectUserInfoByUserId(id);
    }

    /*
    根据传入的参数在数据库中添加一条数据
     */
    @RequestMapping(value = "/insert",produces = "text/html;charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public String insert(UserInfo userInfo) {
        return iUserInfoService.InsertUserInfo(userInfo);
    }

    /*
    传入的一个对象根据userId修改一行的数据
     */
    @RequestMapping(value = "/update",produces = "text/html;charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public String update(UserInfo userInfo) {
        return iUserInfoService.UpdateUserInfo(userInfo);

    }

    /*
    根据传入的userId删除一行数据
     */
    @RequestMapping(value = "/delete",produces = "text/html;charset=utf-8", method = RequestMethod.POST)
    @ResponseBody
    public String delete(Integer userId) {
        return iUserInfoService.DeleteeUserInfo(userId);
    }

}
