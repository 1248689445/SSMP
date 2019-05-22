package com.weixiang.dao.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

@Data
@TableName("news")
public class News extends Model<News> {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;

    private String title;

    private String intro;

    private String content;

    private String author;

    @TableField("release_time")
    private String releaseTime;

    private String source;


    protected Serializable pkVal() {
        return this.id;
    }
}