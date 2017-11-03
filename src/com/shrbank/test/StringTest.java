package com.shrbank.test;

import com.sun.tools.classfile.Synthetic_attribute;

import java.util.List;

/**
 * Created by lilei on 2017/11/2 下午5:23.
 */
public class StringTest {
    public static String INFO = "Hello World!";
    public static final int COUNT = 2000000;

    /**
     * 执行一项String赋值测试
     * */

    public static void doStringTest() {
        String str = new String(INFO);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT / 100; i++) {
            str = str + "miss";
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    /**
     * 执行一项StringBuffer赋值测试
     * */
    public static void doStringBufferTest() {
        StringBuffer stringBuffer = new StringBuffer(INFO);
        long startTime = System.currentTimeMillis();
        for(int i = 0; i < COUNT; i++) {
            stringBuffer = stringBuffer.append("miss");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }


    /**
     * 测试StringBuffer遍历赋值结果
     * @param stringList 参数
     * */

    public static void doStringBufferListTest(List<String> stringList) {
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (String string : stringList) {
            stringBuffer.append(string);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static void main(String[] args) {
        doStringTest();
        doStringBufferTest();
    }
}
