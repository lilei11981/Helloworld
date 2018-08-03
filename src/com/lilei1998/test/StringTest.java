package com.lilei1998.test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lilei on 2017/11/2 下午5:23.
 */
public class StringTest {
    public static final int COUNT = 2000000;
    public static String INFO = "Hello World!";

    /**
     * 执行一项String赋值测试
     */

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
     */
    public static void doStringBufferTest() {
        StringBuffer stringBuffer = new StringBuffer(INFO);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            stringBuffer = stringBuffer.append("miss");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    /**
     * 执行一项 StringBuilder赋值测试
     */
    public static void doStringBuilderTest() {
        StringBuilder stringBuilder = new StringBuilder(INFO);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            stringBuilder = stringBuilder.append("miss");
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }


    /**
     * 测试StringBuffer遍历赋值结果
     *
     * @param stringList 参数
     */

    public static void doStringBufferListTest(List<String> stringList) {
        StringBuffer stringBuffer = new StringBuffer();
        long startTime = System.currentTimeMillis();
        for (String string : stringList) {
            stringBuffer.append(string);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    /**
     * 测试StringBuilder遍历赋值结果
     *
     * @param stringList 参数
     */

    public static void doStringBuilderListTest(List<String> stringList) {
        StringBuilder stringBuilder = new StringBuilder();
        long startTime = System.currentTimeMillis();
        for (Iterator<String> iterator = stringList.iterator(); iterator.hasNext(); ) {
            stringBuilder.append(iterator.next());
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    public static void main(String[] args) {
        doStringTest();
        doStringBufferTest();
        doStringBuilderTest();

        List<String> list = new ArrayList<>();
        list.add("I");
        list.add("like");
        list.add("Beijing");
        list.add("Tian");
        list.add("an");
        list.add("men");

        doStringBufferListTest(list);
        doStringBuilderListTest(list);
    }
}
