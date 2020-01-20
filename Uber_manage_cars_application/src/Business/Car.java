/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;


/**
 *
 * @author manja
 */
public class Car {
    
    private String manufacturer;
    private Integer manufactured_year;
    private Integer min_seats;
    private Integer max_seats;
    private String serial_number;
    private String model_number;
    private String city;
    private Boolean maintenance_cert;
    private Boolean isAvailable;
    private Date createdDate;

    public Date getCreatedDate() {
        return createdDate;
    }
    
    
    public Car(String manufacturer, Integer manufactured_year, Integer min_seats, Integer max_seats, String serial_number, String model_number, String city, Boolean maintenance_cert, Boolean isAvailable) {
        this.createdDate = new Date();
        this.manufacturer = manufacturer;
        this.manufactured_year = manufactured_year;
        this.min_seats = min_seats;
        this.max_seats = max_seats;
        this.serial_number = serial_number;
        this.model_number = model_number;
        this.city = city;
        this.maintenance_cert = maintenance_cert;
        this.isAvailable = isAvailable;
    }
    
    public String getManufacturer() {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getManufactured_year() {
        return manufactured_year;
    }
    public void setManufactured_year(Integer manufactured_year) {
        this.manufactured_year = manufactured_year;
    }

    public int getMax_Seats() {
        return max_seats;
    }
    public void setMax_Seats(int max_seats) {
        this.max_seats = max_seats;
    }
     public int getMin_Seats() {
        return min_seats;
    }
    public void setMin_Seats(int min_seats) {
        this.min_seats = min_seats;
    }

    public String getSerial_number() {
        return serial_number;
    }
    public void setSerial_number(String serial_number) {
        this.serial_number = serial_number;
    }

    public String getModel_number() {
        return model_number;
    }
    public void setModel_number(String model_number) {
        this.model_number = model_number;
    }
    
    

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public Boolean getMaintenance_cert() {
        return maintenance_cert;
    }
    public void setMaintenance_cert(Boolean maintenance_cert) {
        this.maintenance_cert = maintenance_cert;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }
    public void setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    @Override
    public String toString()
    {
        return this.getManufacturer()+" "+this.getManufactured_year()+" "+this.getMin_Seats()+" "+this.getMax_Seats()+" "+this.getSerial_number()+" "+this.getModel_number()+" "+this.getCity()+" "+this.getMaintenance_cert()+" "+this.getIsAvailable()+" "+this.createdDate;
        
    }
    
    
    
}
