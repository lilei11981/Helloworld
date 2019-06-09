package com.company.test.ioCallback.iocallback3;

/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2017-12-04
 * Time: 下午2:36
 * Description:
 * 接口回调基本形式
 */

public class Me {
    public Me(You you) {
        you.doSth(this, "整体公司文件");
    }

    public void doResult(String result) {
        System.out.println("事情" + result);
    }
}
