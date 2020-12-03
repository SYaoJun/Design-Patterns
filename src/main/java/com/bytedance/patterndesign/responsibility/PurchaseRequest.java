package com.bytedance.patterndesign.responsibility;

/**
 * @author yaojun
 * @create 2020-12-03 15:45
 */
public class PurchaseRequest {
    private double price = 0;
    private int id;

    public PurchaseRequest(double price, int id) {
        this.price = price;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
