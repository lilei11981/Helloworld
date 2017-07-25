package com.shrbank.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lilei on 2017/7/11.
 * 使用SimpleDateFormat类的format(date)方法来格式化时间
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();       // 获取时间
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";      // 创建时间格式
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strDateFormat);    // 使用SimpleDateFormat类
        System.out.println(simpleDateFormat.format(date));    // 使用format方法输出时间
    }
}
