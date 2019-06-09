package com.company.test.ioCallback.iocallback3;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-04
 * Time: 下午2:40
 * Description:
 * 接口回调
 */

public class You {
    public void doSth(Me me, String task) {
        System.out.println("你要我做" + task);
        String result = "做完，搞定";
        me.doResult(result);
    }

}
