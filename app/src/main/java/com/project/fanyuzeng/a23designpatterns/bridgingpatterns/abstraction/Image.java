package com.project.fanyuzeng.a23designpatterns.bridgingpatterns.abstraction;

import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.implementor.IOperatorSystem;

/**
 * 抽象图像类
 *
 * @author: fanyuzeng on 2018/1/4 14:46
 */
public abstract class Image {
    protected IOperatorSystem os;

    public void setOS(IOperatorSystem os) {
        this.os = os;
    }

    public abstract void praseFileIntoImage(String filePath);
}
