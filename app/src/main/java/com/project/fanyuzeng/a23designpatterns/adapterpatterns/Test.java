package com.project.fanyuzeng.a23designpatterns.adapterpatterns;

import com.project.fanyuzeng.a23designpatterns.adapterpatterns.adapter.OperationAdapter;
import com.project.fanyuzeng.a23designpatterns.adapterpatterns.target.ScoreOperation;

/**
 * @author: fanyuzeng on 2018/2/24 11:23
 */
public class Test {
    public static void main(String[] args) {
        ScoreOperation operation;  //针对抽象目标接口编程
        operation = new OperationAdapter();
        int scores[] = {84, 76, 50, 69, 90, 91, 88, 96}; //定义成绩数组
        int result[];
        int index;

        System.out.println("成绩排序结果：");
        result = operation.sort(scores);

        //遍历输出成绩
        for (int i : scores) {
            System.out.print(i + ",");
        }
        System.out.println();

        System.out.println("查找成绩90：");
        index = operation.search(result, 90);
        if (index != -1) {
            System.out.println("找到成绩90。在数组中的所因为：" + index);
        } else {
            System.out.println("没有找到成绩90。");
        }

        System.out.println("查找成绩92：");
        index = operation.search(result, 92);
        if (index != -1) {
            System.out.println("找到成绩92。在数组中的所因为：" + index);
        } else {
            System.out.println("没有找到成绩92。");
        }
    }

}
