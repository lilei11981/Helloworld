package com.shrbank.test.ioCallback.iocallback3;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-04
 * Time: 下午2:40
 * Description:
 * 接口回调
 */

public class You {
    public void dosth(Me me, String task) {
        // TODO Auto-generated method stub
        System.out.println("你要我做" + task);
        String result = "做完，搞定";
        me.doresult(result);
    }

}
