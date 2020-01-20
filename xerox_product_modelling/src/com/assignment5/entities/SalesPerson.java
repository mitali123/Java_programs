/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kasai
 */
public class SalesPerson {
    private int salesId;
    private List<Integer> orderList;

    public SalesPerson(int salesId, List<Integer> orderList) {
        this.salesId = salesId;
        this.orderList = new ArrayList();
    }

    public int getSalesId() {
        return salesId;
    }
    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public List<Integer> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Integer> orderList) {
        this.orderList = orderList;
    }

     
   
    
    
}
