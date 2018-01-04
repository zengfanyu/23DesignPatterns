package com.project.fanyuzeng.a23designpatterns.bridgingpatterns.concreteimplementor;

import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.Matrix;
import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.implementor.IOperatorSystem;

/**
 * Window操作系统
 * @author: fanyuzeng on 2018/1/4 15:01
 */
public class WindowsOS implements IOperatorSystem {
    private static final String TAG = "==WindowsOS==";
    @Override
    public void showImage(Matrix m) {
        System.out.print("[showImage] " + "在Windows操作系统中显示像素矩阵 ");
    }
}
