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
    public Admin(String password, String username) {
        super(password, username, "Admin");
    }
 
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        else {
            return false;
        }
    }
    
}
