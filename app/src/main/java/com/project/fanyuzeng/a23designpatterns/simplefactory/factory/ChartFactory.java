package com.project.fanyuzeng.a23designpatterns.simplefactory.factory;

import com.project.fanyuzeng.a23designpatterns.simplefactory.conreteproduct.HistogramChart;
import com.project.fanyuzeng.a23designpatterns.simplefactory.conreteproduct.LineChart;
import com.project.fanyuzeng.a23designpatterns.simplefactory.conreteproduct.PieChart;
import com.project.fanyuzeng.a23designpatterns.simplefactory.product.Chart;

/**
 * @author: fanyuzeng on 2018/5/26 10:23
 */
public class ChartFactory {
    public static Chart getChart(String type) {
        Chart chart = null;
        if (type.equalsIgnoreCase("histogram")) {
            chart = new HistogramChart();
            System.out.println("初始化设置柱状图！");
        }
        else if (type.equalsIgnoreCase("pie")) {
            chart = new PieChart();
            System.out.println("初始化设置饼状图！");
        }
        else if (type.equalsIgnoreCase("line")) {
            chart = new LineChart();
            System.out.println("初始化设置折线图！");
        }
        return chart;
    }
}
