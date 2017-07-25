package com.shrbank.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lilei on 2017/7/25 上午10:48.
 * 使用SimpleDateFormat类的format(date)方法来输出当前时间
 */
public class getCurrentTime {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat();  // 格式化时间
        sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");   // a为am/pm的标记
        Date date = new Date();     // 获取当前时间
        System.out.println("现在时间：" + sdf.format(date));    // 格式化输出现在时间（24小时制）
    }
}
