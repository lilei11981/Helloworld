package com.company.abc.hw;

import java.util.Calendar;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-23
 * Time: 11:27 AM
 * Description:
 * 1900年1月1日是星期一，然后让你输出之后的2018年11月23日是星期几。
 */

public class Test27 {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        String string = inputString.nextLine();
        Test27 test = new Test27();
        String outputWeek = test.getWeek(string);
        System.out.println("最终结果：" + outputWeek);
    }

    public String getWeek(String input) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1900, 0, 1);
        System.out.println("原时间：" + calendar.getTime());
        System.out.println("原时间距离1970-01-01毫秒数：" + calendar.getTime().getTime());
        String[] date = input.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]) - 1;
        int day = Integer.parseInt(date[2]);
        Calendar newCalendar = Calendar.getInstance();
        newCalendar.set(year, month, day);
        System.out.println("新时间：" + newCalendar.getTime());
        System.out.println("原时间距离1970-01-01毫秒数：" + newCalendar.getTime().getTime());
        long oldDateMilliseconds = calendar.getTime().getTime();
        long newDateMilliseconds = newCalendar.getTime().getTime();
        long dateGapMilliseconds = newDateMilliseconds - oldDateMilliseconds;
        long oneDayMilliseconds = 24 * 60 * 60 * 1000;
        int daysGap = 0;
        daysGap = (int) ((dateGapMilliseconds - oneDayMilliseconds) / oneDayMilliseconds);
        System.out.println("相隔天数：" + daysGap);
        int weekInt = daysGap % 7;
        String weekString = "";
        switch (weekInt) {
            case 0: {
                weekString = "星期二";
                break;
            }
            case 1: {
                weekString = "星期三";
                break;
            }
            case 2: {
                weekString = "星期四";
                break;
            }
            case 3: {
                weekString = "星期五";
                break;
            }
            case 4: {
                weekString = "星期六";
                break;
            }
            case 5: {
                weekString = "星期日";
                break;
            }
            case 6: {
                weekString = "星期一";
                break;
            }
            default: {
                break;
            }
        }
        return weekString;
    }
}
