package com.company.zoo.aac;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author lilei
 * @date 2021-06-14 下午8:17
 * @apiNote
 */

public class Demo02 {

    //29比特位
    private static final int COUNT_BITS = Integer.SIZE - 3;
    //实际容量 2^29-1
    private static final int CAPACITY = (1 << COUNT_BITS) - 1;
    // runState is stored in the high-order bits
    // runState存储在高位中
    private static final int RUNNING = -1 << COUNT_BITS;
    private static final int SHUTDOWN = 0 << COUNT_BITS;
    private static final int STOP = 1 << COUNT_BITS;
    private static final int TIDYING = 2 << COUNT_BITS;
    private static final int TERMINATED = 3 << COUNT_BITS;
    //原子状态控制数
    private final AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));

    // Packing and unpacking ctl 打包和解压ctl

    // 解压runState
    private static int runStateOf(int c) {
        return c & ~CAPACITY;
    }

    // 解压workerCount
    private static int workerCountOf(int c) {
        return c & CAPACITY;
    }

    // 打包ctl
    private static int ctlOf(int rs, int wc) {
        return rs | wc;
    }

    public static void main(String[] args) {
        System.out.println(COUNT_BITS);
        System.out.println(Integer.SIZE);
        System.out.println(CAPACITY);
        System.out.println(Integer.toBinaryString(CAPACITY));

        System.out.println(Integer.toBinaryString(RUNNING));
        System.out.println(Integer.toBinaryString(SHUTDOWN));
        System.out.println(Integer.toBinaryString(STOP));

        System.out.println(Integer.toBinaryString(TIDYING));
        System.out.println(Integer.toBinaryString(TERMINATED));

        System.out.println(runStateOf(1));
        System.out.println(workerCountOf(1));
        System.out.println(ctlOf(1, 1));
    }


}
