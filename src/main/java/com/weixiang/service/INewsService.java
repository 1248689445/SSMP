package com.weixiang.service;

import com.baomidou.mybatisplus.service.IService;
import com.weixiang.entity.News;

public interface INewsService extends IService<News> {


    //根据页数和一页显示条数查询
    String SelectByPage(Integer page,Integer number);

}
