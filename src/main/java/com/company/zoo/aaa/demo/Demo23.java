package com.company.zoo.aaa.demo;

import java.util.HashSet;
import java.util.Set;

/**
 * @author lilei
 * @date 2020-12-27 下午4:30
 * @apiNote -XX:PermSize=6M -XX:MaxPermSize=6M
 */

public class Demo23 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i).intern());
        }
    }
}
