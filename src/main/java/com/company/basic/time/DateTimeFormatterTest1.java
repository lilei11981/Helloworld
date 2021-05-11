package com.company.basic.time;

import com.company.utils.StringUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lilei
 * @date 2021-02-07 下午5:30
 * @apiNote
 */

public class DateTimeFormatterTest1 {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    private static ExecutorService service = new ThreadPoolExecutor(50, 100, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));


    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        String oldDate = localDateTime.format(DATE_TIME_FORMATTER);

        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                String newDate = localDateTime.format(DATE_TIME_FORMATTER);
                //多次转换，查看是否相等
                System.out.println(StringUtil.equals(oldDate, newDate));
            });

        }
    }
}
