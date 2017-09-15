package com.shrbank.logging;

import org.apache.log4j.Logger;

/**
 * Created by lilei on 2017/9/15 上午10:43.
 */
public class Log4jTest {
    public static Logger logger = Logger.getLogger(Log4jTest.class);
    public static void main(String[] args) {
        logger.trace("我是logger，trace");
        logger.debug("我是logger，debug");
        logger.info("我是logger，info");
        logger.warn("我是logger，warn");
        logger.error("我是logger，error");
        logger.fatal("我是logger，fatal");
    }
}
