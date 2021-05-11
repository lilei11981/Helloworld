package com.company.zoo.abc.demo14;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;

/**
 * @author lilei
 * @date 2020-09-06 13:59
 * @apiNote
 */

public class Son extends Father {
    public static void main(String[] args) throws Exception {
        //获取子类
        Class clazz = Class.forName("com.company.zoo.abc.demo14.Father");
        //得到父类
        Class superClass = clazz.getSuperclass();
        //得到父类非继承的所以方法
        Method[] methods = superClass.getDeclaredMethods();
        //设置私有方法可以被访问
        AccessibleObject.setAccessible(methods, true);
        for (Method m : methods) {
            System.out.println(m);
        }
    }
}
