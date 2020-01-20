/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;

import Business.Airliner.Flight;
import Business.Airliner.Airliner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author phapa
 */
public class MasterTravelSchedule {
    private TravelAgency ta;
    private List<Flight> totalFlights;
    
    public MasterTravelSchedule(){
        this.totalFlights = new ArrayList();
        this.ta = new TravelAgency();
    }
    public TravelAgency getTa() {
        return ta;
    }

    public void setTa(TravelAgency ta) {
        this.ta = ta;
    }
    
    public void loadAllflights(){
        for(Airliner airliner : this.ta.getAirlinerDirectory().getLstAirliner()){
            for(Flight flight : airliner.getFlightSchedule().getLstFlights()){
                this.totalFlights.add(flight);
            }
        }
    }

    public List<Flight> getTotalFlights() {
        return totalFlights;
    }

    public void setTotalFlights(List<Flight> totalFlights) {
        this.totalFlights = totalFlights;
    }
}
