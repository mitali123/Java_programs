/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Travel;

/**
 *
 * @author manja
 */
public class Seat {
    private int seatNo;
    private Boolean isAvailable;
    public enum seatType {WINDOW, MIDDLE, AISLE}
    
    private seatType seatDetails;

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }  
        public seatType getSeatDetails() {
        return seatDetails;
    }

    public void setSeatDetails(seatType seatDetails) {
        this.seatDetails = seatDetails;
    }
}
