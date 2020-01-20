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
    private List<customerDirectory> customers; 
    private AirlinerDirectory airlinerDirectory;
    
    public TravelAgency(){
        this.customers = new ArrayList();
        this.airlinerDirectory = new AirlinerDirectory();
    }
    public List<customerDirectory> getCustomers() {
        return customers;
    }

    public void setCustomers(List<customerDirectory> customers) {
        this.customers = customers;
    }

    public AirlinerDirectory getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(AirlinerDirectory airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
}
