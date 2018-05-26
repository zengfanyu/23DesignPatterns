package com.project.fanyuzeng.a23designpatterns.absfactory;

import com.project.fanyuzeng.a23designpatterns.absfactory.concretefactory.SpringSkinFactory;
import com.project.fanyuzeng.a23designpatterns.absfactory.concretefactory.SummerSkinFactory;
import com.project.fanyuzeng.a23designpatterns.absfactory.factory.SkinFactory;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.Button;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.ComboBox;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.TextField;

/**
 * @author: fanyuzeng on 2018/5/26 11:35
 */
public class Test {
    public static void main(String[] args) {
        SkinFactory factory1, factory2;
        Button bt1, bt2;
        TextField tf1, tf2;
        ComboBox cb1, cb2;
        //创建夏天风格皮肤
        factory1 = new SummerSkinFactory();
        bt1 = factory1.createButton();
        tf1 = factory1.createTextField();
        cb1 = factory1.createComboBox();
        bt1.display();
        tf1.display();
        cb1.display();
        //创建春天风格皮肤
        factory2 = new SpringSkinFactory();
        bt2 = factory2.createButton();
        tf2 = factory2.createTextField();
        cb2 = factory2.createComboBox();
        bt2.display();
        tf2.display();
        cb2.display();
    }
}
