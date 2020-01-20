/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;
import Business.Users.Admin;
import Business.Users.Customer;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author manja
 */
public class customerDirectory {
    private List<Customer> customerList;
   
   public customerDirectory(){
    this.customerList= new ArrayList<>();
}
    
    private List<Ticket> ticketList;

    public List<Ticket> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket> ticketList) {
        this.ticketList = ticketList;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

   
    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
    
    
}
