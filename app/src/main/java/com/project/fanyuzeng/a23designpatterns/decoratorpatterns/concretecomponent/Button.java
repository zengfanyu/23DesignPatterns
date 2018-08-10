package com.project.fanyuzeng.a23designpatterns.decoratorpatterns.concretecomponent;

import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.component.Component;

/**
 * @author: fanyuzeng on 2018/8/10 14:06
 */
public class Button extends Component {
    @Override
    public void display() {
        System.out.println("Button display......");
    }
}
