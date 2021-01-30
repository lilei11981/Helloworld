package com.company.innerclass.type;

/**
 * @author lilei
 * @date 2020-08-13 15:26
 * @apiNote 一、成员内部类：是指可以用private protect default public任意一个进行修饰的，类文件名：外部类$内部类.class
 * b)静态内部类
 * 静态内部类使用要点
 * 1）当一个静态内部类存在时并不一定存在外部类对象，内部类属于外部类，不属于外部类对象，
 * 因此，静态内部类的实例方法不能直接访问外部类的实例和方法。
 * 2）静态内部类属于外部类的一个静态成员，因此外部类可以通过 “静态内部类.名字”的方式访问静态内部类的静态成员，
 * 通过new静态内部类访问静态内部类的实例。
 */

public class Demo02 {
    public static void main(String[] args) {
        //创建静态内部类对象
        Outer2.Inner2 inner2 = new Outer2.Inner2();
        inner2.show();

        //执行外部了的方法
        new Outer2().show();
    }
}

class Outer2 {

    int age = 300;

    public void show() {
        System.out.println("外部类访问外部类成员：" + age);
        System.out.println("外部类访问内部类成员：" + new Inner2().age);
    }

    //静态内部类
    static class Inner2 {

        int age = 100;

        public void show() {
            /**
             * 当一个静态内部类对象存在，并不一定存在对应的外部类对象。
             * 因此，静态内部类的实例方法不能直接访问外部类的实例方法。
             */
//            System.out.println(Outer2.this.age);
            System.out.println("内部类局部变量：" + age);
        }
    }
}
