package com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.concrete_handler;

import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.PurchaseRequest;
import com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns.handler.Approver;

/**
 * 具体处理者：董事会 <p>
 * 处理金额: [100k,+ infinity)
 *
 * @author: fanyuzeng on 2018/3/24 10:54
 */
public class BoardOfDirectors extends Approver {

    public BoardOfDirectors(String name) {
        mName = name;
    }

    @Override
    public void processPurchase(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAmount() >= 100000) {
            System.out.println("我是董事长" + mName + ",采购单编号：" + purchaseRequest.getNum() + "，金额：" + purchaseRequest.getAmount()
                    + ",用于购买" + purchaseRequest.getPurpose() + ",这笔采购单我来处理。");
        }
    }
}
