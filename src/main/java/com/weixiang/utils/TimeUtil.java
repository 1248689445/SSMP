package com.weixiang.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TimeUtil {
    private static SimpleDateFormat sdf;


    /**
     * 两个时间相减得到天数差
     */
    public static int DateGap(String beginTime,String endTime) throws Exception{
        Date a1 = new SimpleDateFormat("yyyy-MM-dd").parse(endTime.substring(0,10));
        Date b1 = new SimpleDateFormat("yyyy-MM-dd").parse(beginTime.substring(0,10));
        //获取相减后天数
        long day = (a1.getTime()-b1.getTime())/(24*60*60*1000);

        return (int)day;
    }
    /**
     * 两个时间相减的秒数差
     */
    public static int DateSS(String beginTime,String endTime) throws Exception{
        Date a1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(beginTime);
        Date b1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss" ).parse(endTime);
        //获取相减后的秒数
        long day = (b1.getTime()-a1.getTime())/1000;
        return (int)day;
    }

    /**
     * 获取当前时间
     * @return
     */
    public static String currentTime(){
        sdf= new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date());
    }
    /**
     * 获取当前时间精确到秒
     * @return
     */
    public static String currentTimehms(){
        sdf= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return sdf.format(new Date());
    }

    /**
     * 增加n天的方法
     */
    public static String addDay(String s, int n) {
        try {

            sdf= new SimpleDateFormat("yyyy-MM-dd");
            Calendar cd = Calendar.getInstance();
            cd.setTime(sdf.parse(s));
            cd.add(Calendar.DATE, n);//增加一天
            //cd.add(Calendar.MONTH, n);//增加一个月

            return sdf.format(cd.getTime());

        } catch (Exception e) {
            return null;
        }
    }

    /**
     * 增加一个小时
     * @param day
     * @param hour
     * @return
     */
    public static String addDateMinut(String day, int hour){
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;
        try {
            date = sdf.parse(day);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        if (date == null)
            return "";
//        System.out.println("front:" + format.format(date)); //显示输入的日期
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.add(Calendar.HOUR, hour);// 24小时制
        date = cal.getTime();
//        System.out.println("after:" + format.format(date));  //显示更新后的日期
        cal = null;
        return sdf.format(date);

    }
}
