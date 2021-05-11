package com.company.thread.juc;

/**
 * @author lilei
 * @date 2020-08-23 16:56
 * @apiNote 使用同步锁，解决内存可见性的问题
 */

public class Demo02MemoryInvisibilitySolutionSynchronized {
    public static void main(String[] args) {
        ThreadDemo threadDemo = new ThreadDemo();
        new Thread(threadDemo).start();

        while (true) {
            synchronized (threadDemo) {
                if (threadDemo.isFlag()) {
                    System.out.println("---------------");
                    break;
                }
            }
        }
    }

    static class ThreadDemo implements Runnable {

        private boolean flag = false;

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

