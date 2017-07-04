package com.shrbank.abstractdemo;

/**
 * Created by lilei on 2017/6/30.
 * 抽象类
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
