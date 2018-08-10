package com.project.fanyuzeng.a23designpatterns.decoratorpatterns.concretedecorator;

import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.component.Component;
import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.decorator.ComponentDecorator;

/**
 * @author: fanyuzeng on 2018/8/10 14:08
 */
public class ScrollBarDecorator extends ComponentDecorator {

    public ScrollBarDecorator(Component component) {
        super(component);
    }

    @Override
    public void display() {
        setScrollBar();
        super.display();
    }

    private void setScrollBar() {
        System.out.println("add scrollbar decorator");
    }
}
