/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author manja
 */
public class FlightSchedule {
    
    private List<Flight> lstFlights;
    //private String airliner;
    
    public FlightSchedule (){
        this.lstFlights = new ArrayList();
    }

//    public String getAirliner() {
//        return airliner;
//    }
//
//    public void setAirliner(String airliner) {
//        this.airliner = airliner;
//    }

    public List<Flight> getLstFlights() {
        return lstFlights;
    }

    public void setLstFlights(List<Flight> lstFlights) {
        this.lstFlights = lstFlights;
    }
    
    
    
}
