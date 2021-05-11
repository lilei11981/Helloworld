package com.company.file.ioCallback.iocallback4;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-04
 * Time: 下午4:51
 * Description:
 * 接口回调测试
 */

public class You {
    public void doSth(Bound me, String task) {
        System.out.println("你要我做" + task);
        String result = "做完，搞定";
        me.doResult(result);
    }
}
