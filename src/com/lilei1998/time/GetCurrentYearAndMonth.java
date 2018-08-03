package com.lilei1998.time;

import java.util.Calendar;

/**
 * Created by lilei on 2017/7/25 上午11:20.
 * 使用Calendar类获取当前年月
 */
public class GetCurrentYearAndMonth {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int day = calendar.get(Calendar.DATE);
        int month = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

        System.out.println("当前时间：" + calendar.getTime());
        System.out.println("日期：" + day);
        System.out.println("月份：" + month);
        System.out.println("年份：" + year);
        System.out.println("一周的第几天：" + dayOfWeek);
        System.out.println("一月的第几天：" + dayOfMonth);
        System.out.println("一年的第几天：" + dayOfYear);
    }
}
