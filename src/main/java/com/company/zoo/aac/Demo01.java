package com.company.zoo.aac;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author lilei
 * @date 2021-06-14 下午7:12
 * @apiNote
 */

public class Demo01 {

    // Executors executors = (Executors) Executors.newScheduledThreadPool(1);

    static ExecutorService executor = Executors.newSingleThreadExecutor();

    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(1);
            }
        });

        executor.execute(t);
        executor.shutdown();
    }
}
