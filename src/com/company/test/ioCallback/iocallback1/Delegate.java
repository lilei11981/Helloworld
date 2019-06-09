package com.company.test.ioCallback.iocallback1;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-01
 * Time: 下午5:46
 * Description:
 * 该接口主要定义可回调的方法
 */

public interface Delegate {

    // 开始发送时间
    long startTime();

    // 发送结束时间
    long endTime();

    // 发送发射成功与否的消息
    void sendFailedInfo();
}
