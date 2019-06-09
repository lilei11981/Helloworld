package com.company.abstractclass.abstractaction;

/**
 * Created by lilei on 2017/11/24 下午10:37.
 * <p>
 * 定义猪的类，扩展 Action 抽象类
 */
public class Pig extends Action {  // 必须重写父类所有抽象方法
    @Override
    public void eat() {
        System.out.println("猪进食");
    }

    @Override
    public void sleep() {
        System.out.println("猪睡觉");
    }

    @Override
    public void work() {

    }
}
