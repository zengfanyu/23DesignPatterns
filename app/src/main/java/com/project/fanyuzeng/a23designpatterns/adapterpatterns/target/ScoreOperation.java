package com.project.fanyuzeng.a23designpatterns.adapterpatterns.target;

/**
 * 成绩操作接口
 *
 * @author: fanyuzeng on 2018/2/24 11:14
 */
public interface ScoreOperation {
    /**
     * 对成绩进行排序
     *
     * @param array 成绩数组
     * @return 排序过后的成绩数组
     */
    int[] sort(int[] array);

    /**
     * 查找某一特定成绩
     *
     * @param array 成绩数组
     * @param key   特定成绩
     * @return 若成绩数据中存在该特定成绩，则返回该特定成绩在成绩数组中的索引，否则返回 -1
     */
    int search(int[] array, int key);
}
