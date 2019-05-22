package com.weixiang.MapperTest;

import com.baomidou.mybatisplus.plugins.Page;
import com.weixiang.dao.NewsMapper;
import com.weixiang.dao.entity.News;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring.xml", "classpath:spring/spring-mybatis.xml"})
@WebAppConfiguration

public class NewsTest {


//    @Autowired
//    INewsService iNewsService;
    @Autowired
    NewsMapper newsMapper;

    @Test
    public void SelectTest(){

        Page<News> page=new Page<News>(3,2);


        System.out.println(newsMapper.selectByNewsPage(page));
//        System.out.println(iNewsService.selectList(null));
        System.out.println("总条数"+page.getTotal());
        System.out.println("当前页码"+page.getCurrent());
        System.out.println("总页码"+page.getPages());
        System.out.println("每页显示条数"+page.getSize());
        System.out.println("是否有上一页"+page.hasPrevious());
        System.out.println("是否有下一页"+page.hasNext());
    }

//    @Test
//    public void SelectByPage(){
//
//        System.out.println(iNewsService.SelectByPage(null,null));
//
//    }
}
