package com.bytedance.patterndesign.responsibility;

/**
 * @author yaojun
 * @create 2020-12-03 15:52
 */
public class CeoApprover extends Approver{
    public CeoApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() > 10000){
            System.out.println("CEO可以处理："+ purchaseRequest.getId());
        }else{
            approver.processRequest(purchaseRequest); // 交给下一个处理
        }
    }
}
