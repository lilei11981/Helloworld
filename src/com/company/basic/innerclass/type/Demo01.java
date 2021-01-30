package com.company.basic.innerclass.type;

/**
 * @author lilei
 * @date 2020-08-13 15:25
 * @apiNote 一、成员内部类：是指可以用private protect default public任意一个进行修饰的，类文件名：外部类$内部类.class
 * a)非静态内部类
 * 外部类可以使用内部类和我们平时使用其它的类没什么区别。
 * 1）非静态内部类必须寄存在。因此如果有一个非静态内部类对象被创建，
 * 那么它的外部类对象一定会被创建，非静态内部类对象单独属于外部类的某个对象。
 * 2）非静态内部类对象可以单独访问外部类成员，但外部类对象不能直接访问非静态内部类的成员。
 * 3）非静态内部类是属于外部类的某个对象，因此不能有静态方法，属性，静态初始化块。
 * 4）外部类的静态方法不能使用非静态内部类(因为非静态内部类是属于对象的，
 * 外部类的静态方法是属于外部类的，外部类对象还未被创建，因此不能用)，
 * 包括不能使用非静态内部类定义变量，创建实例,但非静态内部类可以使用外部类的属性及方法。
 * 内部类的成员变量访问要点
 * 1）内部类方法的局部变量：直接访问。
 * 2）内部类属性：this.属性名
 * 3）内部类访问外部类属性：外部类.this.属性名
 */

public class Demo01 {
    public static void main(String[] args) {
        // 生成外部类对象
        Outer outer = new Outer();
        outer.testOuter();
        System.out.println("--------------------");
        // 生成内部类对象
        Outer.inner inner = new Outer().new inner();
        inner.show();

    }
}

class Outer {
    public int age = 100;

    void testOuter() {
        System.out.println("外部类对象");
    }

    class inner {
        int ageInner = 80;

        public void show() {
            int ageFun = 300;
            System.out.println("外部类成员变量：" + Outer.this.age);
            System.out.println("内部类成员变量：" + this.ageInner);
            System.out.println("内部类局部变量：" + ageFun);
        }

    }
}
