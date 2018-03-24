package com.project.fanyuzeng.a23designpatterns.chain_of_responsibility_patterns;

/**
 * 采购单 Module
 *
 * @author: fanyuzeng on 2018/3/24 10:48
 */
public class PurchaseRequest {
    /**
     * 采购金额
     */
    private long amount;
    /**
     * 采购编号
     */
    private int num;
    /**
     * 采购用途
     */
    private String purpose;

    public PurchaseRequest(long amount, int num, String purpose) {
        this.amount = amount;
        this.num = num;
        this.purpose = purpose;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
