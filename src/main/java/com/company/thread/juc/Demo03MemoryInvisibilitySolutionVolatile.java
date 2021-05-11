package com.company.thread.juc;

/**
 * @author lilei
 * @date 2020-08-23 17:01
 * @apiNote 使用volatile解决内存可见性问题
 * volatile 相较于 synchronized 是一种较为轻量级的同步策略
 * volatile 不具备"互斥性"
 * volatile 不具备“原子性”
 */

public class Demo03MemoryInvisibilitySolutionVolatile {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        new Thread(threadDemo).start();

        while (true) {
            if (threadDemo.isFlag()) {
                System.out.println("---------------");
                break;
            }
        }
    }

    static class ThreadDemo implements Runnable {

        private volatile boolean flag = false;

        @Override
        public void run() {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            setFlag(true);
            System.out.println("flag = " + isFlag());
        }

        public boolean isFlag() {
            return flag;
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }
    }
}
