package com.project.fanyuzeng.a23designpatterns.adapterpatterns.adapter;

import com.project.fanyuzeng.a23designpatterns.adapterpatterns.adaptee.BinarySearch;
import com.project.fanyuzeng.a23designpatterns.adapterpatterns.adaptee.QuickSort;
import com.project.fanyuzeng.a23designpatterns.adapterpatterns.target.ScoreOperation;

/**
 * @author: fanyuzeng on 2018/2/24 11:22
 */
public class OperationAdapter implements ScoreOperation {

    private BinarySearch mBinarySearch;
    private QuickSort mQuickSort;

    public OperationAdapter() {
        mBinarySearch = new BinarySearch();
        mQuickSort = new QuickSort();
    }

    @Override
    public int[] sort(int[] array) {
        return mQuickSort.quickSort(array);
    }

    @Override
    public int search(int[] array, int key) {
        return mBinarySearch.binarySearch(array, key);
    }
}
