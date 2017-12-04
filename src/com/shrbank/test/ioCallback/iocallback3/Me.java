package com.shrbank.test.ioCallback.iocallback3;

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
        // TODO Auto-generated constructor stub
        you.dosth(this, "整体公司文件");
    }

    public void doresult(String result) {
        System.out.println("事情" + result);
    }
}
