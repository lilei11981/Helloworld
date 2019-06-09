package com.company.hw;

import org.apache.log4j.Logger;


/**
 * Created with IntelliJ IDEA.
 * User: lilei
 * Date: 2018-12-14
 * Time: 11:35 AM
 * Description:
 * 日志测试代码
 */

public class Test32 {
    private static Logger logger = Logger.getLogger(Test32.class);

    public static void main(String[] args) {
        logger.trace("Test32日志测试");
        if (logger.isDebugEnabled()) {
            logger.debug("执行Test32类");
        }
        Test32 test32 = new Test32();
        test32.writeMessage();
    }

    public void writeMessage() {
        logger.debug("执行writeMessage()方法");
    }
}
