package com.company.basic;

/**
 * @author lilei
 * @date 2021-02-22 下午3:10
 * @apiNote
 */

public class RuntimeTest01 {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println(runtime.availableProcessors());
        System.out.println(runtime.freeMemory() / 1024 / 1204);
        runtime.exit(0);
        System.out.println(1);
    }
}
