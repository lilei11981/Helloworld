package com.company.basic.time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author lilei
 * @date 2021-06-05 上午11:32
 * @apiNote
 */

public class SimpleDateFormat02 {

    private static final ThreadLocal<SimpleDateFormat> simpleDateFormat = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
    private static ExecutorService service = new ThreadPoolExecutor(20, 20, 1, TimeUnit.SECONDS, new ArrayBlockingQueue<>(100), new ThreadPoolExecutor.CallerRunsPolicy());

    public static void main(String[] args) {

        for (int i = 0; i < 1; i++) {
            service.execute(() -> {
                Date newDate = null;
                SimpleDateFormat dateFormat = simpleDateFormat.get();
                try {
                    newDate = dateFormat.parse("2021-06-05 11:45:59");
                } catch (ParseException e) {
                    e.printStackTrace();
                } // finally {
                //     simpleDateFormat.remove();
                // }
                System.out.println(Thread.currentThread().getName() + " " + newDate);
            });

        }

        service.shutdown();
    }
}
