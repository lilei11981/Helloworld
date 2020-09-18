package com.company.zoo.test.mBeanTest;

/**
 * Created by lilei on 2017/11/14 上午11:25.
 */
public class Hello implements HelloMBean {
    private String name = "";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void print() {
        System.out.println("Hello," + name + "!");
    }
}
