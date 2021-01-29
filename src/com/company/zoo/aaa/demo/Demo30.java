package com.company.zoo.aaa.demo;

import com.company.zoo.util.SleepUtil;

/**
 * @author lilei
 * @date 2021-01-29 下午12:42
 * @apiNote
 */

public class Demo30 {
//    static Person person = new Person();

    static ThreadLocal<Person> personThreadLocal = new ThreadLocal<>();
    static ThreadLocal<Person> tl2 = new ThreadLocal<>();

    public static void main(String[] args) {
        new Thread(() -> {
            SleepUtil.sleepSeconds(2);
//            System.out.println(person.getName());
            personThreadLocal.set(new Person());
            tl2.set(new Person());
            System.out.println(personThreadLocal.get());
        }).start();

        new Thread(() -> {
            SleepUtil.sleepSeconds(1);
//            person.setName("李四");
            personThreadLocal.set(new Person());
        }).start();
    }

    static public class Person {
        private String name = "张三";

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }


}
