package com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.concrete_handler;

import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.PurchaseRequest;
import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.handler.Approver;

/**
 * @author: fanyuzeng on 2018/3/24 11:41
 */
public class Intern extends Approver {
    public Intern(String name) {
        mName = name;
    }

    @Override
    public void processPurchase(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() >= 0 && purchaseRequest.getAmount() < 10000) {
            System.out.println("我是实习生" + mName + ",采购单编号：" + purchaseRequest.getNum() + "，金额：" + purchaseRequest.getAmount()
                    + ",用于购买" + purchaseRequest.getPurpose()+",这笔采购单我来处理。");
        } else {
            System.out.println("我是实习生" + mName + ",采购单编号：" + purchaseRequest.getNum() + "，金额：" + purchaseRequest.getAmount()+"太大，我处理不了，交给下一级处理。");
            mSuccessor.processPurchase(purchaseRequest);
        }
    }
}
