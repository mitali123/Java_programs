/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.Travel.Ticket;
import Business.Travel.customerDirectory;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manja
 */
public class Customer extends User implements Comparable<Customer> {

    public customerDirectory custDir;
    private Date createdDate;
    private List<Ticket> lstTicket;
    private String CustomerName;
    private Boolean isActive;

    public Customer(String password, String userName, String custName) {
        super(password, userName, "Customer");
        custDir = new customerDirectory();
        this.createdDate = new Date();
        this.lstTicket = new ArrayList();
        this.CustomerName = custName;
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

    public boolean verify(String password) {
        if (password.equals(getPassword())) {
            return true;
        }
        return false;
    }

    public List<Ticket> getLstTicket() {
        return lstTicket;
    }

    public void setLstTicket(List<Ticket> lstTicket) {
        this.lstTicket = lstTicket;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public Boolean getIsActive() {
        return isActive;
    }

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }
}
