package com.company.array.function;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by lilei on 2017/7/21 下午4:48.
 * instanceof 关键字用法
 * instanceof 是Java的一个二元操作符，类似于 == ，> ，< 等操作符
 * instanceof 是Java的保留关键字。它的作用是测试它左边的对象是否是它右边类的实例，返回boolean的数据类型
 * 以下实例创建了displayObjectClass()方法来演示Java instanceof 关键字用法
 */
public class UsageOfInstanceOf {
    public static void main(String[] args) {
        Object testObject = new Vector<>();
        displayObjectClass(testObject);
    }

    private static void displayObjectClass(Object object) {
        if (object instanceof Vector) {
            System.out.println("对象是 java.util.Vector 类的实例");
        } else if (object instanceof ArrayList) {
            System.out.println("对象是 java.util.ArrayList 类的实例");
        } else {
            System.out.println("对象是 " + object.getClass() + " 类的实例");
        }
    }
}
