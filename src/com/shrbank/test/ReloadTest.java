package com.shrbank.test;

/**
 * Created by lilei on 2017/11/6 上午10:31.
 */
public class ReloadTest {  // 不允许两个方法在同一个类中“等效重载”
    Object test() {
        return "abc";
    }

//    String test() {
//        return "123";
//    }

    /*
     * 类中可能有多个匹配方法，
     * 因为 Java 语言禁止在一个类声明具有相同签名但返回类型不同的多个方法，
     * 但 Java 虚拟机并不是如此。
     *
     * 虚拟机中增加的灵活性可以用于实现各种语言特征。
     * */
}
