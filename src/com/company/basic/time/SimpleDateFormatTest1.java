package com.company.basic.time;

import com.company.utils.StringUtil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lilei
 * @date 2021-02-07 下午4:34
 * @apiNote 验证SimpleDateFormat类的线程不安全
 */

public class SimpleDateFormatTest1 {
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static ExecutorService service;

    static {
        service = new ThreadPoolExecutor(50, 100, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));
    }

    public static void main(String[] args) {
        String oldDate = SIMPLE_DATE_FORMAT.format(new Date());

        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                Date parse = null;
                try {
                    parse = SIMPLE_DATE_FORMAT.parse(oldDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                String newDate = SIMPLE_DATE_FORMAT.format(parse);
                //多次转换，查看是否相等

                System.out.println(StringUtil.equals(oldDate, newDate));
            });

        }
    }
}
