package com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.concrete_handler;

import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.PurchaseRequest;
import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.handler.Approver;

/**
 * 具体处理者:主任 <p>
 * 处理金额: [0,10k)
 *
 * @author: fanyuzeng on 2018/3/24 10:50
 */
public class Director extends Approver {


    public Director(String name) {
        mName = name;
    }

    @Override
    public void processPurchase(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() >= 0 && purchaseRequest.getAmount() < 10000) {
            System.out.println("我是主任" + mName + ",采购单编号：" + purchaseRequest.getNum() + "，金额：" + purchaseRequest.getAmount()
                    + ",用于购买" + purchaseRequest.getPurpose()+",这笔采购单我来处理。");
        } else {
            System.out.println("我是主任" + mName + ",采购单编号：" + purchaseRequest.getNum() + "，金额：" + purchaseRequest.getAmount()+"太大，我处理不了，交给下一级处理。");
            mSuccessor.processPurchase(purchaseRequest);
        }
    }
}
