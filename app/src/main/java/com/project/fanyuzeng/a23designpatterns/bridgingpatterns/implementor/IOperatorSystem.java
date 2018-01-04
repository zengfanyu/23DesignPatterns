package com.project.fanyuzeng.a23designpatterns.bridgingpatterns.implementor;

import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.Matrix;

/**
 * @author: fanyuzeng on 2018/1/4 14:48
 */
public interface IOperatorSystem {
    /**
     * 各个操作系统自带的将像素矩阵显示到屏幕上的方法
     *
     * @param m 像素矩阵
     */
    void showImage(Matrix m);
}
