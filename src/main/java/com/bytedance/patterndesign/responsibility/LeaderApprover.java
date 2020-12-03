package com.bytedance.patterndesign.responsibility;

/**
 * @author yaojun
 * @create 2020-12-03 15:48
 */
public class LeaderApprover extends Approver{

    public LeaderApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() < 1000){
            System.out.println("直接leader可以处理："+ purchaseRequest.getId());
        }else{
            approver.processRequest(purchaseRequest); // 交给下一个处理
        }
    }
}
