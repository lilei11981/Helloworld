package com.shrbank.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lilei on 2017/7/11.
 * 使用SimpleDateFormat类的format(date)方法来格式化时间
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        System.out.println(sdf.format(date));
    }
}
