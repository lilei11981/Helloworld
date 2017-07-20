package com.shrbank.thread;

/**
 * Created by lilei on 2017/7/16.
 * 线程优先级设置
 * 通过setPriority()方法来设置线程的优先级
 */
public class SimplePriorities extends Thread {
    private int countDown = 5;        // 定义countDown整型变量
    private volatile double data = 0;    // 用volatile修饰的变量，线程在每次使用变量的时候，都会读取变量修改后的最新的值
    private SimplePriorities(int priority) {    // 构造函数
        setPriority(priority);     // 使用setPriority()方法来设置线程的优先级
        start();  // 一个线程对象生成后,如果要产生一个执行的线程,就一定要调用它的start()方法
    }

    public String toString() {        // 所有对象都有这个方法，返回字符串类型值
        return super.toString() + ": " + countDown;
    }

    /**
     * 一个线程对象生成后，如果要产生一个执行的线程，就一定要调用它的start()方法
     * 线程对象的run()方法完全是一个接口回调方法，它是你这个线程对象要完成的具体逻辑
     * 调用线程对象的run()方法不会产生一个新的线程
     * */

    public void run() {    // 调用线程对象的run()方法，无返回值
        while (true) {
            for (int i = 1; i < 2; i++) {  // 使用循环
                data = data + (Math.PI + Math.E) / (double)i;   // 使用data累加
                System.out.println(this);
                if (--countDown == 0) {         //  判断countDown的值是否为0
                    return;            //   若为0，则返回该值
                }
            }
        }
    }

    public static void main(String[] args) {     //    main()方法
        new SimplePriorities(Thread.MAX_PRIORITY);    //   调用SimplePriorities构造函数，并把Thread.MAX_PRIORITY作为参数值传入
        for (int i = 0; i < 5; i++) {              //  使用循环
            new SimplePriorities(Thread.MIN_PRIORITY);  //  表明优先级最低
        }
    }
}
