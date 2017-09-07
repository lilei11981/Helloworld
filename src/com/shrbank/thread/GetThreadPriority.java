package com.shrbank.thread;

/**
 * Created by lilei on 2017/9/7 下午2:17.
 */
public class GetThreadPriority {
    private static Runnable makeRunnable() {
        return () -> {
            for (int i = 0; i < 5; i++) {
                Thread thread = Thread.currentThread();
                System.out.println("in run() - priority = " + thread.getPriority() + ", name = " + thread.getName());
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
    }

    public static void main(String[] args) {
        System.out.println("in main() - Thread.currentThread().getPriority() = " + Thread.currentThread().getPriority());
        System.out.println("in main() - Thread.currentThread().getName() = " + Thread.currentThread().getName());
        Thread thread = new Thread(makeRunnable(), "thread");
        thread.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("in main() - thread.getPriority() = " + thread.getPriority());
    }
}
