package com.company.thread.juc;

/**
 * @author lilei
 * @date 2020-08-23 16:41
 * @apiNote 1.内存可见性问题（jvm会分配独立缓存给各个线程）
 * 两个线程操作共享数据时，彼此不可见
 */

public class Demo01MemoryInvisibilityProblem {
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


