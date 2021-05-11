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
 * @apiNote 验证SimpleDateFormat类的线程不安全，使用ThreadLocal解决
 */

public class SimpleDateFormatTest2 {

    private static final ThreadLocal<SimpleDateFormat> THREAD_LOCAL = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));

    private static ExecutorService service = new ThreadPoolExecutor(50, 100, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100));

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {
            service.execute(() -> {
                SimpleDateFormat simpleDateFormat = THREAD_LOCAL.get();
                String oldDate = simpleDateFormat.format(new Date());
                try {
                    Date parseDate = simpleDateFormat.parse(oldDate);
                    String newDate = simpleDateFormat.format(parseDate);
                    System.out.println(StringUtil.equals(oldDate, newDate));
                } catch (ParseException e) {
                    e.printStackTrace();
                } finally {
                    THREAD_LOCAL.remove();
                }
            });

        }
    }
}
