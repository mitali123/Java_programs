/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.Airliner.AirlinerDirectory;
import Business.Travel.customerDirectory;
import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author manja
 */
public class Customer extends User implements Comparable<Customer>{
   public customerDirectory custDir;
    private Date createdDate;
    
    
    public Customer(String password, String userName, String role) {
        super(password, userName, "Customer");
        custDir = new customerDirectory();
         this.createdDate = new Date();
    }
   
    
    public Date getCreatedDate() {
        return createdDate;
    }

    public customerDirectory getCustDir() {
        return custDir;
    }

    public void setCustDir(customerDirectory custDir) {
        this.custDir = custDir;
    }
    
    
    
    
    @Override
    public int compareTo(Customer c) {
        return c.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
}
