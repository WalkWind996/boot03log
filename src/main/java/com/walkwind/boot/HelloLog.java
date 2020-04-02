package com.walkwind.boot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Author walkwind
 * @Description:日志的使用
 * @Date 2020-4-2-15:21
 **/
public class HelloLog {
    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(HelloLog.class);
        logger.info("HelloLog");
    }
}
