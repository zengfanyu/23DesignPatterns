package com.project.fanyuzeng.a23designpatterns.absfactory.concretefactory;

import com.project.fanyuzeng.a23designpatterns.absfactory.concreteproduct.SummerButton;
import com.project.fanyuzeng.a23designpatterns.absfactory.concreteproduct.SummerComnoBox;
import com.project.fanyuzeng.a23designpatterns.absfactory.concreteproduct.SummerTextField;
import com.project.fanyuzeng.a23designpatterns.absfactory.factory.SkinFactory;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.Button;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.ComboBox;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.TextField;

/**
 * @author: fanyuzeng on 2018/5/26 11:34
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComnoBox();
    }
}
