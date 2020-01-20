/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Airliner;

import Business.Travel.Seat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author manja
 */
public class Airplane {

  

    private String model;
    private String airplaneType;
    private List<Seat> seats;
    private static Airplane airplane;
    private Boolean isAvailable;

    public Airplane() {
        this.seats = new ArrayList();
        addSeats();
    }

    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getAirplaneType() {
        return airplaneType;
    }

    public void setAirplaneType(String airplaneType) {
        this.airplaneType = airplaneType;
    }

//    public String getAirliner() {
//        return airliner;
//    }
//
//    public void setAirliner(String airliner) {
//        this.airliner = airliner;
//    }
    public static Airplane getInstance(){
        if(airplane==null){
            return new Airplane();
        }
        else {
            return airplane;
        }
    }
    private void addSeats() {

        int seatNo = 1;
        String[] seatArrangement = {"WINDOW", "MIDDLE", "AISLE", "AISLE", "MIDDLE", "WINDOW"};
        for (int i = 0; i < 25; i++) {
            for (int j = 0; j < 6; j++) {
                Seat s = new Seat();
                s.setIsAvailable(true);
                s.setSeatNo(seatNo++);
                s.setSeatDetails(Seat.seatType.valueOf(seatArrangement[j]));
                this.seats.add(s);
            }
        }
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
      public static Airplane getAirplane() {
        return airplane;
    }

    public static void setAirplane(Airplane aAirplane) {
        airplane = aAirplane;
    }
    @Override
    public String toString(){
        return this.getAirplaneType();
    }
}
