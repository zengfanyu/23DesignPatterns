package com.project.fanyuzeng.a23designpatterns.factorymethod.concretefactory;

import com.project.fanyuzeng.a23designpatterns.factorymethod.concreteproduct.DatabaseLogger;
import com.project.fanyuzeng.a23designpatterns.factorymethod.factory.LoggerFactory;
import com.project.fanyuzeng.a23designpatterns.factorymethod.product.Logger;

/**
 * @author: fanyuzeng on 2018/5/26 10:55
 */
public class DatabaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        //连接数据库，代码省略
        //创建数据库日志记录器对象
        Logger logger = new DatabaseLogger();
        //初始化数据库日志记录器，代码省略
        return logger;
    }
}
