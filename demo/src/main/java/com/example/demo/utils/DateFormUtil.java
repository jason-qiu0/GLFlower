package com.example.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormUtil {
    public static String getSysdate(){
    Date  date=new Date();
     return date.getTime()+"";
    }
    public static  String getFormatDate(){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String date = df.format(new Date());
        return  date;
    }
}
