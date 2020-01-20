/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

/**
 *
 * @author kasai
 */
public class Order {
    
    int orderId;
    int salesId;//salesperson
    int customerId;
    Item item;

    public Order(int orderId, int salesId, int customerId, Item item) {
        this.orderId = orderId;
        this.salesId = salesId;
        this.customerId = customerId;
        this.item = item;
    }

    public Order() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getOrderId() {
        return orderId;
    }
    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getsalesId() {
        return salesId;
    }
    public void setSalesId(int supplierId) {
        this.salesId = supplierId;
    }

    public int getCustomerId() {
        return customerId;
    }
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    
}
