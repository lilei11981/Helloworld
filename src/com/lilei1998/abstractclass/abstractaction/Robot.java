package com.lilei1998.abstractclass.abstractaction;

/**
 * Created by lilei on 2017/11/24 下午10:32.
 * <p>
 * 定义机器人的类，扩展 Action 抽象类
 */
public class Robot extends Action {
    @Override
    public void eat() {
        System.out.println("机器人充电");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void work() {
        System.out.println("机器人工作");
    }
}
