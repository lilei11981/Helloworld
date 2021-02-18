package com.company.zoo.aaa.demo;

/**
 * @author lilei
 * @date 2020-07-03 10:59
 * @apiNote
 */

public class Demo05 {

    public static void main(String[] args) {

        System.out.println("最大内存：" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
        System.out.println("可用内存：" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
        System.out.println("已使用内存：" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");

        System.out.println("=============================================================");

        byte[] b = new byte[200 * 1024 * 1024];
        System.out.println("分配了200M空间给数组....");

        System.out.println("最大内存：" + Runtime.getRuntime().maxMemory() / 1024 / 1024 + "M");
        System.out.println("可用内存：" + Runtime.getRuntime().freeMemory() / 1024 / 1024 + "M");
        System.out.println("已使用内存：" + Runtime.getRuntime().totalMemory() / 1024 / 1024 + "M");
        // the maximum number of processors available to the virtual machine; never smaller than one
        System.out.println("线程：" + Runtime.getRuntime().availableProcessors());


    }
}
