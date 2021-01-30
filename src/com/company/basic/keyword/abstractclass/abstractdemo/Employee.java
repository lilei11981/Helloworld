package com.company.basic.keyword.abstractclass.abstractdemo;

/**
 * Created by lilei on 2017/6/30.
 * 抽象类
 * <p>
 * 普通类是一个完善的功能类，可以直接产生实例化对象，
 * 并且在普通类中可以包含有构造方法、普通方法、static方法、常量和变量等内容。
 * 而抽象类是指在普通类的结构里面增加抽象方法的组成部分。
 * <p>
 * 那么什么叫抽象方法呢？在所有的普通方法上面都会有一个“{}”，这个表示方法体，
 * 有方法体的方法一定可以被对象直接使用。
 * 而抽象方法，是指没有方法体的方法，同时抽象方法还必须使用关键字abstract做修饰。
 * <p>
 * 而拥有抽象方法的类就是抽象类，抽象类要使用abstract关键字声明。
 * <p>
 * abstract class A{      //定义一个抽象类
 * public void fun(){  //普通方法
 * System.out.println("存在方法体的方法");
 * }
 * public abstract void print();   //抽象方法，没有方法体，有abstract关键字做修饰
 * }
 */

public abstract class Employee {
    private String name;
    private String address;
    private int number;

    public Employee(String name, String address, int number) {  // 构造函数
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public double computePay() {
        return 0.0;
    }

    public void mailCheck() {
        System.out.println("Mailing to " + this.name + " " + this.address);
    }

    public String toString() {
        return name + " " + address + " " + number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public int getNumber() {
        return number;
    }
}
