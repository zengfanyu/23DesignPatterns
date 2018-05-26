package com.project.fanyuzeng.a23designpatterns.factorymethod.concretefactory;

import com.project.fanyuzeng.a23designpatterns.factorymethod.concreteproduct.FileLogger;
import com.project.fanyuzeng.a23designpatterns.factorymethod.factory.LoggerFactory;
import com.project.fanyuzeng.a23designpatterns.factorymethod.product.Logger;

/**
 * @author: fanyuzeng on 2018/5/26 10:55
 */
public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //创建文件日志记录器对象
        Logger logger = new FileLogger();
        //创建文件，代码省略
        return logger;
    }
}
