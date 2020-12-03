package com.bytedance.patterndesign.responsibility;

/**
 * @author yaojun
 * @create 2020-12-03 15:44
 */
public abstract class Approver {
    Approver approver;
    String name;

    public Approver(String name) {
        this.name = name;
    }

    public Approver getApprover() {
        return approver;
    }
    // 下一个处理者
    public void setApprover(Approver approver) {
        this.approver = approver;
    }
    // 处理信息
    public abstract void processRequest(PurchaseRequest purchaseRequest);
}
