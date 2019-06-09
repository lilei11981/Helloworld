package com.company.java8;

interface Vehicle {
    static void blowHorn() {
        System.out.println("按喇叭!!!");
    }

    default void print() {
        System.out.println("我是一辆车!");
    }
}

interface FourWheeler {
    default void print() {
        System.out.println("我是一辆四轮车!");
    }
}

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-11-19
 * Time: 2:43 PM
 * Description:
 * Java8新特性 默认方法
 */

public class DefaultMethods {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.print();
    }
}

class Car implements Vehicle, FourWheeler {
    public void print() {
        Vehicle.super.print();
        FourWheeler.super.print();
        Vehicle.blowHorn();
        System.out.println("我是一辆汽车!");
    }
}
