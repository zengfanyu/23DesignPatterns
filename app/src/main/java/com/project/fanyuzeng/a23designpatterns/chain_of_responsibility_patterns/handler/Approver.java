package com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.handler;

import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.PurchaseRequest;

/**
 * 抽象处理者
 *
 * @author: fanyuzeng on 2018/3/24 10:43
 */
public abstract class Approver {
    /**
     * 后继处理者
     */
    public Approver mSuccessor;
    protected String mName;

    /**
     * 抽象处理方法
     *
     * @param purchaseRequest 采购单实体类
     */
    public abstract void processPurchase(PurchaseRequest purchaseRequest);
}
