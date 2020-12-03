package com.bytedance.patterndesign.responsibility;

/**
 * @author yaojun
 * @create 2020-12-03 15:51
 */
public class SupervisorApprover extends Approver{
    public SupervisorApprover(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if(purchaseRequest.getPrice() > 1000 && purchaseRequest.getPrice() < 10000){
            System.out.println("直接主管可以处理："+ purchaseRequest.getId());
        }else{
            approver.processRequest(purchaseRequest); // 交给下一个处理
        }
    }
}
