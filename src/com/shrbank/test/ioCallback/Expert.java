package com.shrbank.test.ioCallback;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-01
 * Time: 下午6:08
 * Description:
 * 专家类，实现回调接口，作为委托人出现
 */

public class Expert implements Delegate {

    @Override
    public long startTime() {
        return System.currentTimeMillis();
    }

    @Override
    public long endTime() {
        return System.currentTimeMillis();
    }

    @Override
    public void sendFailedInfo() {
        System.out.println("发射超时！");
    }

    // 发射火箭
    public void send() {
        if (new Rocket(this).isSendSuccessful()) {
            System.out.println("发射成功！");
        }
    }
}
