package com.shrbank.abstractclass.abstractaction;

/**
 * Created by lilei on 2017/11/24 下午10:39.
 */
public class AbstractDemo {
    public static void main(String[] args) {
        fun(new Robot());
        fun(new Human());
        fun(new Pig());
    }

    public static void fun(Action action) {
        action.command(Action.EAT);
        action.command(Action.SLEEP);
        action.command(Action.WORK);
    }
}
