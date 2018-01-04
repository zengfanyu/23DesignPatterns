package com.project.fanyuzeng.a23designpatterns.bridgingpatterns.concreteimplementor;

import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.Matrix;
import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.implementor.IOperatorSystem;

/**
 * Linux 操作系统
 *
 * @author: fanyuzeng on 2018/1/4 15:02
 */
public class LinuxOS implements IOperatorSystem {
    private static final String TAG = "==LinuxOS==";
    @Override
    public void showImage(Matrix m) {
        System.out.print("[showImage] " + "在Linux操作系统中显示像素矩阵 ");
    }
}
