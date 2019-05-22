package com.weixiang.service;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.weixiang.dao.NewsMapper;
import com.weixiang.dao.entity.News;
import com.weixiang.utils.exception.TestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsMapper newsMapper;

    //根据页数和一页显示条数查询
    @Transactional
    public String SelectByPage(Integer page, Integer number) {
        if(page==null){
            page=1;
        }
        if (number==null){
            number=5;
        }
        Page<News> pages=new Page<News>(page,number);

        List<News> list=newsMapper.selectByNewsPage(pages);

        JSONObject json=new JSONObject();
        json.put("list",list);
        json.put("pages:",pages.getPages());
        json.put("current:",pages.getCurrent());
        json.put("remainingPages:",pages.getPages()-pages.getCurrent());

        return json.toJSONString();
    }

    //根据页数和一页显示条数查询
    @Transactional(readOnly = true,rollbackFor = TestException.class)
    public News SelectByAll(Integer test) throws TestException {

        if (test==null){
            throw new TestException();
        }


           return newsMapper.selectById(test);


    }
}
