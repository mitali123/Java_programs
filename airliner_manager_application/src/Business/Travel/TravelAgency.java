/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;

import Business.Airliner.AirlinerDirectory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author phapa
 */
public class TravelAgency {

    private customerDirectory customerDirectory;
    private AirlinerDirectory airlinerDirectory;

    public TravelAgency() {
        this.customerDirectory = new customerDirectory();
        this.airlinerDirectory = new AirlinerDirectory();
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }

    public customerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(customerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
}
