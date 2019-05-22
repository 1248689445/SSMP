package com.weixiang.view;

import com.alibaba.fastjson.JSON;
import com.weixiang.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/API")
public class NewsController {

    @Autowired
    INewsService iNewsService;

    /*
    根据页数和页显示条数查询
     */
    @RequestMapping(value = "/newlist",method = RequestMethod.POST)
    @ResponseBody
    public String newlist(Integer page,Integer number){

        return iNewsService.SelectByPage(page,number);
    }

    /*
    根据id查询单个新闻详情
     */
    @RequestMapping(value = "/newlist/{id}",method = RequestMethod.POST)
    @ResponseBody
    public String newlist(@PathVariable Integer id){

        return JSON.toJSONString(iNewsService.selectById(id));
    }


}
