package com.lilei1998.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lilei on 2017/7/25 上午11:55.
 * 时间戳转换成时间
 */
public class TimestampToTime {
    public static void main(String[] args) {
        Long timeStamp = System.currentTimeMillis();
        System.out.println(timeStamp);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String simpleDate = simpleDateFormat.format(new Date(Long.parseLong(String.valueOf(timeStamp))));
        System.out.println(simpleDate);
    }
}
