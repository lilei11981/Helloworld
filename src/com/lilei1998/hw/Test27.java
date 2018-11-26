package com.lilei1998.hw;

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
        calendar.set(2018, 0, 1);
        String[] date = input.split("-");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]) - 1;
        int day = Integer.parseInt(date[2]);
        Calendar newCalendar = Calendar.getInstance();
        newCalendar.set(year, month, day);
        int daysGap = 0;
        daysGap = (int) (newCalendar.getTime().getTime() - calendar.getTime().getTime()) / (24 * 60 * 60 * 1000);
        int weekInt = daysGap % 7;
        String weekString = "";
        switch (weekInt) {
            case 0: {
                weekString = "星期一";
                break;
            }
            case 1: {
                weekString = "星期二";
                break;
            }
            case 2: {
                weekString = "星期三";
                break;
            }
            case 3: {
                weekString = "星期四";
                break;
            }
            case 4: {
                weekString = "星期五";
                break;
            }
            case 5: {
                weekString = "星期六";
                break;
            }
            case 6: {
                weekString = "星期日";
                break;
            }
            default: {
                break;
            }
        }
        return weekString;
    }
}
