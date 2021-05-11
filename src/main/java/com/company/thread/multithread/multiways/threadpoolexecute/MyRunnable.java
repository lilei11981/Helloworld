package com.company.thread.multithread.multiways.threadpoolexecute;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author lilei
 * @date 2020-06-10 23:26
 * @apiNote
 */

public class MyRunnable implements Runnable {
    ArrayList<Integer> arrayList = new ArrayList<>();
    Random random = new Random();

    @Override
    public void run() {
        arrayList.add(random.nextInt(10));
        System.out.println(arrayList.get(0));
        System.out.println(arrayList);
        System.out.println("--------------------");
    }
}
