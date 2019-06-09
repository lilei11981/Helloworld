package com.company.thread;

/**
 * Created by lilei on 2017/9/7 下午2:37.
 */
public class InterruptThread implements Runnable {
    public static void main(String[] args) {
        InterruptThread interruptThread = new InterruptThread();
        Thread thread = new Thread(interruptThread);
        thread.start();
        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("in main() - 中断其他线程");
        thread.interrupt();
        System.out.println("in main() - 离开");
    }

    @Override
    public void run() {
        try {
            System.out.println("in run() - 将运行make() 方法");
            make();
            System.out.println("in run() - 从 make() 方法回来");
        } catch (InterruptedException e) {
            System.out.println("in run() - 中断 make() 方法");
        }
        System.out.println("in run() - 休眠后执行");
        System.out.println("in run() - 正常离开");
    }

    public void work() throws InterruptedException {
        while (true) {
            for (int i = 0; i < 10; i++) {
                int j = i * 2;
            }
            System.out.println("A isInterrupted() = " + Thread.currentThread().isInterrupted());
            if (Thread.interrupted()) {
                System.out.println("B isInterrupted() = " + Thread.currentThread().isInterrupted());
                throw new InterruptedException();
            }
        }
    }

    private void make() throws InterruptedException {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println("C isInterrupted() = " + Thread.currentThread().isInterrupted());
                Thread.sleep(2000);
                System.out.println("D isInterrupted() = " + Thread.currentThread().isInterrupted());
            }
        }
    }
}
