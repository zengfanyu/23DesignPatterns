package com.project.fanyuzeng.a23designpatterns.simplefactory;

import com.project.fanyuzeng.a23designpatterns.simplefactory.factory.ChartFactory;
import com.project.fanyuzeng.a23designpatterns.simplefactory.product.Chart;

/**
 * @author: fanyuzeng on 2018/5/26 10:25
 */
public class Test {

    public static void main(String[] args) {
        Chart chart;
        chart = ChartFactory.getChart("histogram"); //通过静态工厂方法创建产品
        chart.display();
    }
}
