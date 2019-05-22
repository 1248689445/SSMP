package com.weixiang.view;

import com.alibaba.fastjson.JSON;
import com.weixiang.dao.entity.News;
import com.weixiang.service.NewsService;
import com.weixiang.utils.exception.TestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/API")
public class NewsController {

    public static final Logger logger= LoggerFactory.getLogger(NewsController.class);

    @Autowired
    NewsService newsService;

    /*
    根据页数和页显示条数查询
     */
    @RequestMapping(value = "/newlist",method = RequestMethod.POST)
    @ResponseBody
    public String newlist(Integer page,Integer number){

        return newsService.SelectByPage(page,number);
    }


    /*
    根据id查询对应数据
     */
    @RequestMapping(value = "/newid",method = RequestMethod.POST)
    @ResponseBody
    public Map newlist(Integer id){

        Map map=new HashMap();
        News news = null;
        try {
            news = newsService.SelectByAll(id);
        } catch (TestException e) {
            e.printStackTrace();
            map.put("param","参数为空");
            logger.info("参数为空异常");
        }
        return map;
    }
}
