package com.project.fanyuzeng.a23designpatterns.decoratorpatterns.decorator;

import com.project.fanyuzeng.a23designpatterns.decoratorpatterns.component.Component;

/**
 * @author: fanyuzeng on 2018/8/10 14:02
 */
public class ComponentDecorator extends Component {
    private Component mComponent;

    public ComponentDecorator(Component component) {
        mComponent = component;
    }

    @Override
    public void display() {
        mComponent.display();
    }
}
