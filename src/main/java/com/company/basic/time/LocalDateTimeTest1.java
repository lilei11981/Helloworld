package com.company.basic.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author lilei
 * @date 2021-02-07 下午5:38
 * @apiNote
 */

public class LocalDateTimeTest1 {

    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // 2019-11-20T15:04:29.017
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
    }
}
