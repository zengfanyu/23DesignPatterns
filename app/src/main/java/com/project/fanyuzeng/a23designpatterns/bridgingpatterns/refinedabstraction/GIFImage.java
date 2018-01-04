package com.project.fanyuzeng.a23designpatterns.bridgingpatterns.refinedabstraction;

import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.Matrix;
import com.project.fanyuzeng.a23designpatterns.bridgingpatterns.abstraction.Image;

/**
 * GIF格式图像扩充类
 *
 * @author: fanyuzeng on 2018/1/4 14:58
 */
public class GIFImage extends Image {
    private static final String TAG = "==GIFImage==";

    @Override
    public void praseFileIntoImage(String filePath) {
        //模拟创建图像矩阵
        Matrix m = new Matrix(filePath);
        //调用不同操作系统的展示图像方法去显示图片
        os.showImage(m);
        System.out.println("[praseFileIntoImage] " + filePath + ",格式为:GIF");
    }
}
