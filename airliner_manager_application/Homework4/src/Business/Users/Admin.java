/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.Airliner.AirlinerDirectory;
import Business.Travel.customerDirectory;

/**
 *
 * @author manja
 */
public class Admin extends User {
    private String password;
    private String username;
    

    public Admin(String password, String username, String role) {
        super("", "", "Admin");
        this.password = password;
        this.username = username;
        
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
 
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
