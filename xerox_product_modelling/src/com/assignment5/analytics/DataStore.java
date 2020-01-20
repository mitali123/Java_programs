/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.analytics;

import java.util.HashMap;
import java.util.Map;
import com.assignment5.entities.*;
import java.util.List;

/**
 *
 * @author manja
 */
public class DataStore {
    private static DataStore dataStore;
    
    private Map<Integer,Product> products;
    private Map<Integer,Order> orders;
    private Map<Integer,List<Integer>> sales;
    private Map<Integer,Item> items;
    private Map<Integer,List<Integer>> customers;
    
    private DataStore()
    {
        products = new HashMap();
        orders = new HashMap();
        sales = new HashMap();
        items = new HashMap();
        customers = new HashMap();
    }
    public static DataStore getInstance(){
        if(dataStore == null)
            dataStore = new DataStore();
        return dataStore;
    }

    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    

    public Map<Integer, Item> getItems() {
        return items;
    }

    public void setItems(Map<Integer, Item> items) {
        this.items = items;
    }

    public Map<Integer, List<Integer>> getSales() {
        return sales;
    }

    public void setSales(Map<Integer, List<Integer>> sales) {
        this.sales = sales;
    }

    public Map<Integer, List<Integer>> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<Integer, List<Integer>> customers) {
        this.customers = customers;
    }

   
    
    
}
