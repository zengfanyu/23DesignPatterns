package com.project.fanyuzeng.a23designpatterns.absfactory.concreteproduct;

import com.project.fanyuzeng.a23designpatterns.absfactory.product.Button;

/**
 * @author: fanyuzeng on 2018/5/26 11:30
 */
public class SummerButton implements Button {
    @Override
    public void display() {
        System.out.println("显示浅蓝色按钮。");
    }
}
