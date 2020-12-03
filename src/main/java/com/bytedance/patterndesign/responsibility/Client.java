package com.bytedance.patterndesign.responsibility;

/**
 * @author yaojun
 * @create 2020-12-03 15:53
 */
public class Client {
    public static void main(String[] args) {
        //创建一个请求
        PurchaseRequest purchaseRequest = new PurchaseRequest(1005, 999);

        //创建审批人
        LeaderApprover leaderApprover = new LeaderApprover("wangheng");
        SupervisorApprover supervisorApprover = new SupervisorApprover("chenhao");
        CeoApprover ceoApprover = new CeoApprover("zhangyiming");

        //设定各个审批级别的下一个人 形成一个环
        leaderApprover.setApprover(supervisorApprover);
        supervisorApprover.setApprover(ceoApprover);
        ceoApprover.setApprover(leaderApprover);

        //创建关系
        ceoApprover.processRequest(purchaseRequest);

    }
}
