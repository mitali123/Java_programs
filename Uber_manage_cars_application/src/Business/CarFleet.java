/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
import java.util.Date;

/**
 *
 * @author manja
 */
public class CarFleet {
    
    private ArrayList<Car> carList;
    private Integer size = 0;
    private String carmanufacturer;
    private String serial;
    
    
    public CarFleet(){
        this.carList = new ArrayList<Car>();
        
        Car car1 = new Car("Ferrari",1995,1,3,"bhw54","nsh","Boston",true,true);
        Car car2 = new Car("BMW",1999,1,4,"hso98","hs7a","Boston",true,true);
        Car car3 = new Car("Toyota",2000,2,4,"wgs6","kaj","New York",false,true);
        Car car4 = new Car("Mercedes",2003,1,2,"dvs7","anc0","San Jose",true,false);
        Car car5 = new Car("Ferrari",1989,1,4,"bxm0","nsh","Texas",false,false);
        Car car6 = new Car("Baleno",2001,3,7,"ysh8","mch4","New York",true,true);
        Car car7 = new Car("Porsche",2005,2,8,"jsk0","nsd","Seattle",false,true);
        Car car8 = new Car("BMW",2001,1,4,"hdn9","uan2","Florida",true,false);
        Car car9 = new Car("Porsche",2001,2,6,"kao0","usn6","Boston",true,true);
        Car car10 = new Car("Toyota",2000,2,4,"ndj9","nak2","New York",false,true);
        Car car11 = new Car("Baleno",1999,1,5,"nsk2","nfr6","Texas",true,true);
        Car car12 = new Car("Jeep",2001,2,7,"vsf7","msk9","New York",true,true);
        Car car13 = new Car("Jeep",1999,1,4,"ncm2","hd8e","Boston",true,false);
        Car car14 = new Car("Ferrari",2008,2,5,"ndj0","nsh","New York",false,false);
        Car car15 = new Car("Jeep",2014,1,5,"mhw7","vha5","Chicago",true,true);
        
        
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        carList.add(car5);
        carList.add(car6);
        carList.add(car7);
        carList.add(car8);
        carList.add(car9);
        carList.add(car10);
        carList.add(car11);
        carList.add(car12);
        carList.add(car13);
        carList.add(car14);
        carList.add(car15);
    }

    public ArrayList<Car> getCarFleet() {
        
        return carList;
    }
    
    public Date lastupdated()
    {
        Date lastupdate;
        size = carList.size();
        Car lastcar = carList.get(size-1);
        lastupdate = lastcar.getCreatedDate();
        return lastupdate;
    }

    public void setCarFleet(ArrayList<Car> carFleet) {
        this.carList = carList;
    }
    public Iterator getlistIndex()
    {
        Iterator iter = carList.iterator();
        return iter;
    }
    public Integer getlistsize()
    {
        size = carList.size();
        return size;
    }
    
    public Car addCar(Car car)
    {
        carList.add(car);
        return car;
    }
    
    public void removeCar(Car car)
    {
        carList.remove(car);
    }
    
    
     
}
