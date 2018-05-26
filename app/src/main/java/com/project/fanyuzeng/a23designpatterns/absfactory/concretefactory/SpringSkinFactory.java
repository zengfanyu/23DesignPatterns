package com.project.fanyuzeng.a23designpatterns.absfactory.concretefactory;

import com.project.fanyuzeng.a23designpatterns.absfactory.concreteproduct.SpringButton;
import com.project.fanyuzeng.a23designpatterns.absfactory.concreteproduct.SpringComboBox;
import com.project.fanyuzeng.a23designpatterns.absfactory.concreteproduct.SpringTextField;
import com.project.fanyuzeng.a23designpatterns.absfactory.factory.SkinFactory;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.Button;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.ComboBox;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.TextField;

/**
 * @author: fanyuzeng on 2018/5/26 11:34
 */
public class SpringSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
