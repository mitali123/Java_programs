/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import Business.Travel.Seat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author manja
 */
public class Flight {
    public enum flightTime{
        MORNING, AFTERNOON, EVENING, NIGHT;
    }
    private flightTime flightTiming; 
    private Date startTime;
    private Date endTime;
    private String Duration;
    private String startLocation;
    private String endLocation;
    private List<Seat> flight;
    private Airplane airplane;
    private Airliner airliner;
    //private String FLightId;

    public flightTime getFlightTiming() {
        return flightTiming;
    }

    public void setFlightTiming(flightTime flightTiming) {
        this.flightTiming = flightTiming;
    }

    public Airliner getAirliner() {
        return airliner;
    }

    public void setAirliner(Airliner airliner) {
        this.airliner = airliner;
    }
    
    public Flight(){
        this.flight= new ArrayList();
    }
    
    public List<Seat> getFlight() {
        return flight;
    }

    public void setFlight(List<Seat> flight) {
        this.flight = flight;
    }

//    public String getFLightId() {
//        return FLightId;
//    }
//
//    public void setFLightId(String FLightId) {
//        this.FLightId = FLightId;
//    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getDuration() {
        return Duration;
    }

    public void setDuration(String Duration) {
        this.Duration = Duration;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public Airplane getAirplane() {
        return airplane;
    }

    public void setAirplane(Airplane airplane) {
        this.airplane = airplane;
    }

}
