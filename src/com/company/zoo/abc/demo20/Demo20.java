package com.company.zoo.abc.demo20;

/**
 * @author lilei
 * @date 2020-08-13 13:49
 * @apiNote
 */

public class Demo20 {
    public static void main(String[] args) {
        Child child = new Child();
        ((Parent) child).method();
        child.method();
    }
}
