package com.weixiang.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.weixiang.dao.NewsMapper;
import com.weixiang.entity.News;
import com.weixiang.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl extends ServiceImpl<NewsMapper,News> implements INewsService {

    @Autowired
    private NewsMapper newsMapper;

    //根据页数和一页显示条数查询
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
}
