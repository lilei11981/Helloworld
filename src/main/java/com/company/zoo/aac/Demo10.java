package com.company.zoo.aac;

/**
 * @author lilei
 * @date 2021-06-21 下午11:11
 * @apiNote
 */

public class Demo10 {

    public static void main(String[] args) {

        System.out.println(String.class.getClassLoader());
        // 结果是null, 因为Bootstrap使用C++实现，Java里并没有class与之对应

        // System.out.println(sun.awt.HKSCS.class.getClassLoader());
        // 核心库里执行结果null, 也是被Bootstrap加载过的

        // System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader());
        // 这个类是位于ext目录下的，因此是扩展类加载器

        System.out.println(Demo10.class.getClassLoader());
        // 自己写的，由App类加载器加载

        // System.out.println(sun.net.spi.nameservice.dns.DNSNameService.class.getClassLoader().getClass().getClassLoader());
        // ext的classloader调用getclass本身也是一个class，调用getClassLoader,还是ClassLoaderBootstrap,执行结果为null

        System.out.println(Demo10.class.getClassLoader().getClass().getClassLoader());

    }
}
