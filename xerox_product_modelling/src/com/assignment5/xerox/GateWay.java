/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import java.io.IOException;
import java.util.HashMap;
import com.assignment5.entities.Product;
import java.util.Map;
import com.assignment5.entities.*;
import java.util.ArrayList;
import java.util.List;
import com.assignment5.analytics.DataStore;
import com.assignment5.analytics.AnalysisHelper;

/**
 *
 * @author kasai
 */
public class GateWay {
    
    public static void main(String args[]) throws IOException{
        
        DataGenerator generator = DataGenerator.getInstance();
        //DataStore ds = DataStore.getDataStore();
        storeProductData(generator);
        storeSalesData(generator);
        AnalysisHelper helper = new AnalysisHelper();
        //call analysis methods here
    }
    
    public static void storeProductData(DataGenerator generator)
    {
        int prodId;
        int minPrice;
        int maxPrice;
        int targetPrice;
        try
        {
            DataReader prodReader = new DataReader(generator.getProductCataloguePath());
            
            String[] prodRow;
           
            while((prodRow = prodReader.getNextRow()) != null)
            {
                //make obj of prod
                prodId = Integer.parseInt(prodRow[0]);
                minPrice = Integer.parseInt(prodRow[2]);
                maxPrice = Integer.parseInt(prodRow[1]);
                targetPrice = Integer.parseInt(prodRow[3]);
                Product p = new Product(prodId,minPrice,maxPrice,targetPrice);
                DataStore.getInstance().getProducts().put(p.getProductId(),p);
            }
            System.out.println("prodMap");
            System.out.println("prodId,maxPrice,minPrice,targetPrice");
            for(Map.Entry<Integer,Product> a : DataStore.getInstance().getProducts().entrySet())
            {
                System.out.print(a.getKey()+" ");
                Product newprod = a.getValue();
                System.out.print(newprod.getMinPrice()+" ");
                System.out.print(newprod.getMaxPrice()+" ");
                System.out.print(newprod.getTargetPrice()+"\n");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    public static void storeSalesData(DataGenerator generator)
    {
        int orderId;
        int itemId;
        int productId;
        int quantity;
        int salesId;
        int customerId;
        int salesPrice;
        
        try
        {
            DataReader salesReader = new DataReader(generator.getOrderFilePath());
            
            String[] salesRow;
            while((salesRow = salesReader.getNextRow()) != null)
            {
                orderId = Integer.parseInt(salesRow[0]);
                itemId = Integer.parseInt(salesRow[1]);
                productId = Integer.parseInt(salesRow[2]);
                quantity = Integer.parseInt(salesRow[3]);
                salesId = Integer.parseInt(salesRow[4]);
                customerId = Integer.parseInt(salesRow[5]);
                salesPrice = Integer.parseInt(salesRow[6]);
                
                //add data to ordermap
                Item newItem = new Item(productId,salesPrice,quantity,itemId);
                Order newOrder = new Order(orderId,salesId,customerId,newItem);
                
                DataStore.getInstance().getOrders().put(orderId, newOrder);
                
                //add data to itemmap
                DataStore.getInstance().getItems().put(itemId, newItem);
                
                //add data to customermap
                List<Integer> data = new ArrayList<>();
                if(DataStore.getInstance().getCustomers().keySet().contains(customerId))
                {
                    data = DataStore.getInstance().getCustomers().get(customerId);
                    data.add(orderId);
                    DataStore.getInstance().getCustomers().put(customerId, data);
                }
                else
                {
                    data.add(orderId);
                    DataStore.getInstance().getCustomers().put(customerId, data);
                }
                
                //add data to salesmap
                List<Integer> salesdata = new ArrayList<>();
                if(DataStore.getInstance().getSales().keySet().contains(salesId))
                {
                    salesdata = DataStore.getInstance().getSales().get(salesId);
                    data.add(orderId);
                    DataStore.getInstance().getSales().put(salesId, data);
                }
                else
                {
                    data.add(salesId);
                    DataStore.getInstance().getSales().put(salesId, data);
                }
            }
            //print keymaps
            System.out.println("orderMap");
            System.out.println("orderId,salesId,custId,productId,salesPrice,quantity,itemId");
            for(Map.Entry<Integer,Order> o : DataStore.getInstance().getOrders().entrySet())
            {
                System.out.print(o.getKey()+" ");
                Order newOrder = o.getValue();
                System.out.print(newOrder.getOrderId()+" ");
                System.out.print(newOrder.getsalesId()+" ");
                System.out.print(newOrder.getCustomerId()+" ");
                System.out.print(newOrder.getItem().getProductId()+" ");
                System.out.print(newOrder.getItem().getSalesPrice()+" ");
                System.out.print(newOrder.getItem().getQuantity()+" ");
                System.out.print(newOrder.getItem().getItemId()+"\n");
            }
            System.out.println("ItemMap");
            System.out.println("itemId,productId,salesPrice,quantity");
            for(Map.Entry<Integer,Item> i : DataStore.getInstance().getItems().entrySet())
            {
                System.out.print(i.getKey()+" ");
                Item newitem = i.getValue();
                System.out.print(newitem.getProductId()+" ");
                System.out.print(newitem.getSalesPrice()+" ");
                System.out.print(newitem.getQuantity()+"\n");
            }
            System.out.println("CustMap");
            System.out.println("custId,OrderIDs");
            for(Map.Entry<Integer,List<Integer>> c : DataStore.getInstance().getCustomers().entrySet())
            {
                System.out.print(c.getKey()+" ");
                List<Integer> newcust = c.getValue();
                for(int i = 0; i< newcust.size();i++)
                {
                    System.out.print(newcust.get(i)+" ");
                }
                System.out.println("\n");
            }
            System.out.println("SalesMap");
            System.out.println("salesId,OrderIDs");
            for(Map.Entry<Integer,List<Integer>> s : DataStore.getInstance().getSales().entrySet())
            {
                System.out.print(s.getKey()+" ");
                List<Integer> newsale = s.getValue();
                for(int i = 0; i< newsale.size();i++)
                {
                    System.out.print(newsale.get(i)+" ");
                }
                System.out.println("\n");
            }
           
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
    
   