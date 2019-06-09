package com.company.test;

/**
 * Created by lilei on 2017/11/6 上午11:10.
 */
public class ConditionTest {
    public static void main(String[] args) {
        Object o1 = true ? new Integer(1) : new Double(2.0);
        Object o2;
        if (true) {
            o2 = new Integer(1);
        } else {
            o2 = new Double(2.0);
        }
        System.out.println(o1);
        System.out.println(o2);
    }

    /*
     * 三目运算符会在有需要的情况下，对操作数进行类型提升
     * */
}
