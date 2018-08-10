package com.project.fanyuzeng.a23designpatterns.decoratorpatterns.concretedecorator;

import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.component.Component;
import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.decorator.ComponentDecorator;

/**
 * @author: fanyuzeng on 2018/8/10 14:42
 */
public class BlackBorderDecorator extends ComponentDecorator {
    public BlackBorderDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setBlackBorder();
        super.display();
    }

    private void setBlackBorder() {
        System.out.println("add black border decorator");
    }
}
