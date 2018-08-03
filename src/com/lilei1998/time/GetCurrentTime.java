package com.lilei1998.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by lilei on 2017/7/25 上午10:48.
 * 使用SimpleDateFormat类的format(date)方法来输出当前时间
 */

public class GetCurrentTime {
    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();  // 格式化时间
        simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss a");   // a为am/pm的标记
        Date date = new Date();     // 获取当前时间
        System.out.println("现在时间：" + simpleDateFormat.format(date));    // 格式化输出现在时间（24小时制）
    }
}
