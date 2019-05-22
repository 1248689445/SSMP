package com.weixiang.utils;

import com.alibaba.fastjson.JSONObject;

public class JSONUtil {
    private static JSONObject json=new JSONObject();

    //成功的方法
    public static String Success(){
        json.put("message","success");
        return String.valueOf(json);
    }

    //失败的方法
    public static String NotNull(){
        json.put("message","参数问题或者操作失败！！！");
        return String.valueOf(json);
    }
}
