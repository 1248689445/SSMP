package com.weixiang.dao.entity;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@TableName(value = "user_info")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo extends Model<UserInfo> {
    @TableId(value = "id",type = IdType.AUTO)
    private Integer id;
    @TableField(value = "user_id")
    private Integer userId;
    private String nickname;
    private String sex;
    private Integer age;

    protected Serializable pkVal() {
        return this.id;
    }
}
