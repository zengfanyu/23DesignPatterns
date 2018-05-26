package com.project.fanyuzeng.a23designpatterns.absfactory.concreteproduct;

import com.project.fanyuzeng.a23designpatterns.absfactory.product.ComboBox;

/**
 * @author: fanyuzeng on 2018/5/26 11:31
 */
public class SummerComnoBox implements ComboBox {
    @Override
    public void display() {
        System.out.println("显示蓝色边框组合框。");
    }
}
