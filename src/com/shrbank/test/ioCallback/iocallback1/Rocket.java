package com.shrbank.test.ioCallback.iocallback1;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-01
 * Time: 下午5:51
 * Description:
 * 火箭类，使用到回调接口的方法
 */

public class Rocket {

    // 火箭将及时的操作委托给委托者处理
    private Delegate delegate;

    public Rocket(Delegate delegate) {
        super();
        this.delegate = delegate;
    }

    // 获取开始发送时间
    public long getRocketStartTime() {
        return delegate.startTime();
    }

    // 获取发送结束时间
    public long getRocketEndTime() {
        return delegate.endTime();
    }

    // 判断是否发送成功
    public boolean isSendSuccessful() {
        if (getRocketStartTime() - getRocketEndTime() <= 10) {
            return true;
        }
        delegate.sendFailedInfo();
        return false;
    }
}
