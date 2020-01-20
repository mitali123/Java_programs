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
public class Airliner {

    private static Airliner airliner;
    private String airlinerName;
    private Fleet fleet;
    private FlightSchedule flightSchedule;

    public Airliner() {
    }

    public static Airliner getAirliner() {
        return airliner;
    }

    public static void setAirliner(Airliner aAirliner) {
        airliner = aAirliner;
    }

    public static Airliner getInstance() {
        if (airliner == null) {
            return new Airliner();
        }
        return airliner;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public Fleet getFleet() {
        return fleet;
    }

    public void setFleet(Fleet fleet) {
        this.fleet = fleet;
    }

    public FlightSchedule getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(FlightSchedule flightSchedule) {
        this.flightSchedule = flightSchedule;
    }
    
    @Override
    public String toString() {
        return getAirlinerName(); //To change body of generated methods, choose Tools | Templates.
    }
}
