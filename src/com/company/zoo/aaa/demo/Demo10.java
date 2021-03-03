package com.company.zoo.aaa.demo;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author lilei
 * @date 2021-02-27 下午7:16
 * @apiNote
 */

public class Demo10 {

    // public static void main(String[] args) {
    //     Person<Object> person = new Person<>();
    //     System.out.println(person.getName());
    // }
    //
    // public static class Person<T> {
    //     T name;
    //
    //     public T getName() {
    //         return name;
    //     }
    //
    //     public void setName(T name) {
    //         this.name = name;
    //     }
    // }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(null);
        System.out.println(queue.isEmpty());
    }
}
