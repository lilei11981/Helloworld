package com.company.zoo.abc.demo01;

/**
 * @author lilei
 * @date 2020-06-28 10:42
 * @apiNote
 */

public class Person {

    private String name;
    private int balance;

    public Person() {
    }

    public Person(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "姓名：" + name + ", 余额" + balance;
    }
}
