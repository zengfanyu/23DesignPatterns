package com.project.fanyuzeng.a23designpatterns.factorymethod.factory;

import com.project.fanyuzeng.a23designpatterns.factorymethod.product.Logger;

/**
 * @author: fanyuzeng on 2018/5/26 10:54
 */
public interface LoggerFactory {
    //此处创建 Logger 方法可重载
    Logger createLogger();
}
