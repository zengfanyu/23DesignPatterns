package com.project.fanyuzeng.a23designpatterns.factorymethod;

import com.project.fanyuzeng.a23designpatterns.factorymethod.concretefactory.FileLoggerFactory;
import com.project.fanyuzeng.a23designpatterns.factorymethod.factory.LoggerFactory;
import com.project.fanyuzeng.a23designpatterns.factorymethod.product.Logger;

/**
 * @author: fanyuzeng on 2018/5/26 10:58
 */
public class Test {
    public static void main(String[] args) {
        LoggerFactory factory;
        Logger logger;
        factory = new FileLoggerFactory(); //可引入配置文件实现
        logger = factory.createLogger();
        logger.writeLog();
    }
}
