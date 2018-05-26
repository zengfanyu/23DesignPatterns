package com.project.fanyuzeng.a23designpatterns.factorymethod.concreteproduct;

import com.project.fanyuzeng.a23designpatterns.factorymethod.product.Logger;

/**
 * @author: fanyuzeng on 2018/5/26 10:53
 */
public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录。");
    }
}
