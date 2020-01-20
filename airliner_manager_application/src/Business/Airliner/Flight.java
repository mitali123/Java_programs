/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import java.util.Date;

/**
 *
 * @author manja
 */
public class Flight {

    public enum flightTime {
        MORNING, AFTERNOON, EVENING, NIGHT
    }
    private String airlinerName;
    private flightTime flightTiming;
    private Date startTime;
    private Date endTime;
    private double duration;
    private String startLocation;
    private String endLocation;
    private Airplane airplane;
    private double cost;

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

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public flightTime getFlightTiming() {
        return flightTiming;
    }

    public void setFlightTiming(flightTime flightTiming) {
        this.flightTiming = flightTiming;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    @Override
    public String toString() {
        return this.airlinerName;
    }

}
