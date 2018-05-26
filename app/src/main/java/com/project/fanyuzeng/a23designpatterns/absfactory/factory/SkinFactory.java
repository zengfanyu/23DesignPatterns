package com.project.fanyuzeng.a23designpatterns.absfactory.factory;

import com.project.fanyuzeng.a23designpatterns.absfactory.product.Button;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.ComboBox;
import com.project.fanyuzeng.a23designpatterns.absfactory.product.TextField;

/**
 * @author: fanyuzeng on 2018/5/26 11:33
 */
public interface SkinFactory {
    Button createButton();

    TextField createTextField();

    ComboBox createComboBox();
}
