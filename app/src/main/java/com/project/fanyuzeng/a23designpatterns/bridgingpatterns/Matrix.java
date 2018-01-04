package com.project.fanyuzeng.a23designpatterns.bridgingpatterns;

/**
 * 模拟像素矩阵类,系统会将各种格式的文件解析为此类
 *
 * @author: fanyuzeng on 2018/1/4 14:48
 */
public class Matrix {
    private String filePath;

    public Matrix(String filePath) {
        this.filePath = filePath;
    }
}
