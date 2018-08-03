package com.lilei1998.abstractclass.abstractaction;

/**
 * Created by lilei on 2017/11/22 下午3:29.
 */
public abstract class Action {

    public static final int EAT = 1;  // 成员变量
    public static final int SLEEP = 2;
    public static final int WORK = 5;

    public abstract void eat();   // 抽象方法不能有方法体

    public abstract void sleep();

    public abstract void work();

    public void command(int flags) {  // 非抽象方法
        switch (flags) {
            case EAT:
                this.eat();
                break;
            case SLEEP:
                this.sleep();
                break;
            case WORK:
                this.work();
                break;
            case EAT + SLEEP:
                this.eat();
                this.sleep();
                break;
            case SLEEP + WORK:
                this.sleep();
                this.work();
                break;
            default:
                break;
        }
    }
}
