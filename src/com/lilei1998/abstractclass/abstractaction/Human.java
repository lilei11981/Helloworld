package com.lilei1998.abstractclass.abstractaction;

/**
 * Created by lilei on 2017/11/24 下午10:34.
 * <p>
 * 定义人的类，扩展 Action 抽象类
 */
public class Human extends Action {
    @Override
    public void eat() {
        System.out.println("人吃饭");
    }

    @Override
    public void sleep() {
        System.out.println("人睡觉");
    }

    @Override
    public void work() {
        System.out.println("人工作");
    }
}
