package com.project.fanyuzeng.a23designpatterns.decoratorpatterns;

import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.component.Component;
import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.concretecomponent.Button;
import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.concretecomponent.Windos;
import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.concretedecorator.BlackBorderDecorator;
import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.concretedecorator.ScrollBarDecorator;
import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.decorator.ComponentDecorator;

/**
 * @author: fanyuzeng on 2018/8/10 14:43
 */
public class Test {
    public static void main(String[] args) {
        Component mButton = new Button();
        Component mWindow = new Windos();

        //为按钮添加上黑色边框
        ComponentDecorator mBlackBorderDecor = new BlackBorderDecorator(mButton);
        mBlackBorderDecor.display();
        //为按钮添加上滚动条
        ComponentDecorator mScrollBarDecor = new ScrollBarDecorator(mButton);
        mScrollBarDecor.display();

        //为窗口添加上黑色边框和滚动条
        ComponentDecorator mBlackBorderWindow = new BlackBorderDecorator(mWindow);
        ComponentDecorator mBlackBorderScrollBarWindow = new ScrollBarDecorator(mBlackBorderWindow);
        mBlackBorderScrollBarWindow.display();


    }
}
