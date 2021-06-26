package com.company.zoo.aac;

import com.company.HelloWorld;
import sun.misc.Unsafe;

/**
 * @author lilei
 * @date 2021-06-21 下午11:00
 * @apiNote
 */

public class Demo09 {

    public static void main(String[] args) {
        System.out.println(String.class.getClassLoader());
        System.out.println(Object.class.getClassLoader());
        System.out.println(Demo09.class.getClassLoader());
        System.out.println(HelloWorld.class.getClassLoader());
        System.out.println(Unsafe.class.getClassLoader());
        System.out.println(Math.class.getClassLoader());
    }
}
