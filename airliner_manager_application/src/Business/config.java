/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Airliner.Fleet;
import Business.Airliner.FlightSchedule;
import Business.Airliner.Flight;
import Business.Airliner.Airplane;
import Business.Airliner.AirlinerDirectory;
import Business.Airliner.Airliner;
import Business.Travel.Ticket;
import Business.Travel.customerDirectory;
import Business.Users.Admin;
import Business.Users.Customer;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author phapa
 */
public class config {

    public static Fleet generateFleet() {
        Fleet fleet = new Fleet();
        int number = 320;
        for (int i = 0; i < 5; i++) {
            Airplane a = Airplane.getInstance();
            a.setAirplaneType("Airbus");
            a.setModel("A" + number);
            a.setIsAvailable(true);
            number += 100;
            fleet.getLstAirplane().add(a);
        }
        int number2 = 737;
        for (int i = 0; i < 5; i++) {
            Airplane a = Airplane.getInstance();
            a.setAirplaneType("Boeing");
            a.setModel("B" + number2);
            a.setIsAvailable(true);
            number2 += 10;
            fleet.getLstAirplane().add(a);
        }
        return fleet;
    }

    public static FlightSchedule generateSchedule(String airlinerName, String startLocation, String EndLocation, double cost, String startDate, String endDate, double duration, Airplane ap, FlightSchedule fs) {
        Date sDate = new Date();
        Date eDate = new Date();
        Date afternoon = new Date();
        Date evening = new Date();
        Date night = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            sDate = simpleDateFormat.parse(startDate);
            eDate = simpleDateFormat.parse(endDate);
            afternoon = timeFormat.parse("12:00:00");
            evening = timeFormat.parse("16:00:00");
            night = timeFormat.parse("20:00:00");
        } catch (ParseException ex) {
            Logger.getLogger(config.class.getName()).log(Level.SEVERE, null, ex);
        }

        Flight flight = new Flight();
        flight.setStartLocation(startLocation);
        flight.setEndLocation(EndLocation);
        flight.setStartTime(sDate);
        flight.setEndTime(eDate);
        flight.setDuration(duration);
        flight.setAirplane(ap);
        flight.setAirlinerName(airlinerName);
        ap.setIsAvailable(false);
        flight.setCost(cost);
        DateFormat df = new SimpleDateFormat("HHmmss");
        if (df.format(sDate).compareTo(df.format(afternoon)) < 0) {
            flight.setFlightTiming(Flight.flightTime.MORNING);
        } else if (df.format(sDate).compareTo(df.format(evening)) < 0) {
            flight.setFlightTiming(Flight.flightTime.AFTERNOON);
        }
        else if(df.format(sDate).compareTo(df.format(night)) < 0){
            flight.setFlightTiming(Flight.flightTime.EVENING);
        }
        else {
            flight.setFlightTiming(Flight.flightTime.NIGHT);
        }
        fs.getLstFlights().add(flight);
        return fs;
    }

    public static AirlinerDirectory configureAirlines() {

        AirlinerDirectory airlinerDirectory = new AirlinerDirectory();

        Airliner emirates = Airliner.getInstance();
        emirates.setAirlinerName("Emirates");
        emirates.setFleet(config.generateFleet());
        FlightSchedule emiratesFS = new FlightSchedule();
        airlinerDirectory.getLstAirliner().add(emirates);

        Airliner etihad = Airliner.getInstance();
        etihad.setAirlinerName("Etihad");
        etihad.setFleet(config.generateFleet());
        FlightSchedule etihadFS = new FlightSchedule();
        airlinerDirectory.getLstAirliner().add(etihad);

        Airliner britishAirways = Airliner.getInstance();
        britishAirways.setAirlinerName("British Airways");
        britishAirways.setFleet(config.generateFleet());
        FlightSchedule britishAirwaysFS = new FlightSchedule();
        airlinerDirectory.getLstAirliner().add(britishAirways);

        Airliner delta = Airliner.getInstance();
        delta.setAirlinerName("Delta");
        delta.setFleet(config.generateFleet());
        FlightSchedule deltaFS = new FlightSchedule();
        airlinerDirectory.getLstAirliner().add(delta);

        Airliner americanAirlines = Airliner.getInstance();
        americanAirlines.setAirlinerName("American Airlines");
        americanAirlines.setFleet(config.generateFleet());
        FlightSchedule americanAirlinesFS = new FlightSchedule();
        airlinerDirectory.getLstAirliner().add(americanAirlines);

        emirates.setFlightSchedule(generateSchedule(emirates.getAirlinerName(), "Boston", "New York", 100, "2019-11-20 12:15:20", "2019-11-20 16:15:20", 4, emirates.getFleet().getLstAirplane().get(0), emiratesFS));
        emirates.getFleet().getLstAirplane().get(0).setIsAvailable(false);

        emirates.setFlightSchedule(generateSchedule(emirates.getAirlinerName(),"New York", "California", 70, "2019-12-12 15:17:20", "2019-12-2 17:17:20", 2, emirates.getFleet().getLstAirplane().get(1), emiratesFS));
        emirates.getFleet().getLstAirplane().get(1).setIsAvailable(false);

        emirates.setFlightSchedule(generateSchedule(emirates.getAirlinerName(), "New York", "California", 150, "2019-12-12 18:00:00", "2019-12-13 01:00:00", 7, emirates.getFleet().getLstAirplane().get(2), emiratesFS));
        emirates.getFleet().getLstAirplane().get(2).setIsAvailable(false);

        etihad.setFlightSchedule(generateSchedule(etihad.getAirlinerName(),"Boston", "Chicago", 85, "2019-11-12 8:00:00", "2019-11-12 12:00:00", 4, etihad.getFleet().getLstAirplane().get(0), etihadFS));
        etihad.getFleet().getLstAirplane().get(0).setIsAvailable(false);

        etihad.setFlightSchedule(generateSchedule(etihad.getAirlinerName(), "California", "New York", 100, "2020-2-2 9:15:00", "2020-2-3 5:15:00", 8, etihad.getFleet().getLstAirplane().get(1), etihadFS));
        etihad.getFleet().getLstAirplane().get(1).setIsAvailable(false);

        etihad.setFlightSchedule(generateSchedule(etihad.getAirlinerName(),"California", "Texas", 60, "2019-12-24 13:00:00", "2019-12-25 19:00:00", 6, etihad.getFleet().getLstAirplane().get(2), etihadFS));
        etihad.getFleet().getLstAirplane().get(2).setIsAvailable(false);

        britishAirways.setFlightSchedule(generateSchedule(britishAirways.getAirlinerName(), "Boston", "New Jersey", 60, "2019-10-26 9:15:00", "2019-11-26 13:00:00", 4, britishAirways.getFleet().getLstAirplane().get(0), britishAirwaysFS));
        britishAirways.getFleet().getLstAirplane().get(0).setIsAvailable(false);

        britishAirways.setFlightSchedule(generateSchedule(britishAirways.getAirlinerName(),"Texas", "Chicago", 70, "2019-12-12 4:00:00", "2019-12-12 9:00:00", 5, britishAirways.getFleet().getLstAirplane().get(1), britishAirwaysFS));
        britishAirways.getFleet().getLstAirplane().get(1).setIsAvailable(false);

        britishAirways.setFlightSchedule(generateSchedule(britishAirways.getAirlinerName(),"Chicago", "California", 75, "2020-1-11 6:00:00", "2020-01-11 11:00:00", 5, britishAirways.getFleet().getLstAirplane().get(2), britishAirwaysFS));
        britishAirways.getFleet().getLstAirplane().get(2).setIsAvailable(false);

        delta.setFlightSchedule(generateSchedule(delta.getAirlinerName(),"Boston", "New York", 60, "2019-11-20 23:15:00", "2019-11-21 03:15:00", 4, delta.getFleet().getLstAirplane().get(0), deltaFS));
        delta.getFleet().getLstAirplane().get(0).setIsAvailable(false);

        delta.setFlightSchedule(generateSchedule(delta.getAirlinerName(),"New York", "California", 40, "2019-12-02 11:00:00", "2019-12-02 13:00:00", 2, delta.getFleet().getLstAirplane().get(1), deltaFS));
        delta.getFleet().getLstAirplane().get(1).setIsAvailable(false);

        delta.setFlightSchedule(generateSchedule(delta.getAirlinerName(),"New York", "California", 75, "2019-12-12 09:20:00", "2019-12-12 16:20:00", 7, delta.getFleet().getLstAirplane().get(2), deltaFS));
        delta.getFleet().getLstAirplane().get(2).setIsAvailable(false);

        americanAirlines.setFlightSchedule(generateSchedule(americanAirlines.getAirlinerName(), "Boston", "New York", 60, "2019-11-20 10:00:00", "2019-11-21 02:00:00", 4, americanAirlines.getFleet().getLstAirplane().get(0), americanAirlinesFS));
        americanAirlines.getFleet().getLstAirplane().get(0).setIsAvailable(false);

        americanAirlines.setFlightSchedule(generateSchedule(americanAirlines.getAirlinerName(),"New York", "California", 40, "2019-12-2 10:00:00", "2019-12-2 12:00:00", 2, americanAirlines.getFleet().getLstAirplane().get(1), americanAirlinesFS));
        americanAirlines.getFleet().getLstAirplane().get(1).setIsAvailable(false);

        americanAirlines.setFlightSchedule(generateSchedule(americanAirlines.getAirlinerName(),"New York", "California", 75, "2019-12-12 06:00:00", "2019-12-12 13:00:00", 7, americanAirlines.getFleet().getLstAirplane().get(2), americanAirlinesFS));
        americanAirlines.getFleet().getLstAirplane().get(2).setIsAvailable(false);

        return airlinerDirectory;
    }
    
    public static customerDirectory generateUsers(){
        
        customerDirectory cd = new customerDirectory();
        
        Customer c1 = new Customer("Pass1*", "user_1@gmail.com","Alex");
        Customer c2 = new Customer("Pass2*", "user_2@gmail.com", "Steven");
        Customer c3 = new Customer("Pass3*", "user_3@gmail.com", "Jon");
        Customer c4 = new Customer("Pass4*", "user_4@gmail.com", "Harry");
        Customer c5 = new Customer("Pass5*", "user_5@gmail.com", "Alen");
        Customer c6 = new Customer("Pass6*", "user_6@gmail.com", "Mike");
        Customer c7 = new Customer("Pass7*", "user_7@gmail.com", "Peter");
        Customer c8 = new Customer("Pass8*", "user_8@gmail.com", "Dana");
        Customer c9 = new Customer("Pass9*", "user_9@gmail.com", "Egen");
        Customer c10 = new Customer("Pass10*", "user_10@gmail.com", "Ross");
        Customer c11 = new Customer("Pass11*", "user_11@gmail.com", "Tim");
        Customer c12 = new Customer("Pass12*", "user_12@gmail.com", "Jim");
        Customer c13 = new Customer("Pass13*", "user_13@gmail.com", "Ryan");
        Customer c14 = new Customer("user", "user","Akshay");
        
        cd.getCustomerList().add(c1);
        cd.getCustomerList().add(c2);
        cd.getCustomerList().add(c3);
        cd.getCustomerList().add(c4);
        cd.getCustomerList().add(c5);
        cd.getCustomerList().add(c6);
        cd.getCustomerList().add(c7);
        cd.getCustomerList().add(c8);
        cd.getCustomerList().add(c9);
        cd.getCustomerList().add(c10);
        cd.getCustomerList().add(c11);
        cd.getCustomerList().add(c12);
        cd.getCustomerList().add(c13);  
        cd.getCustomerList().add(c14);
        
        //Assigning ticket to some customers:
        Ticket ticket = new Ticket();
        //Get one flight assoiated with this
        Airliner a = config.configureAirlines().getLstAirliner().get(0);
        Flight f = a.getFlightSchedule().getLstFlights().get(0);
        ticket.setFlightDate(f.getStartTime());
        ticket.setFrom(f.getStartLocation());
        ticket.setTo(f.getEndLocation());
        ticket.setPassengerName(c1.getCustomerName());
        ticket.setSeatNo(f.getAirplane().getSeats().get(0));
        f.getAirplane().getSeats().get(0).setIsAvailable(false);
        c1.getLstTicket().add(ticket);
        
        //Assigning ticket to some customers:
        Ticket ticket2 = new Ticket();
        //Get one flight assoiated with this
        Airliner a2 = config.configureAirlines().getLstAirliner().get(1);
        Flight f2 = a.getFlightSchedule().getLstFlights().get(0);
        ticket.setFlightDate(f2.getStartTime());
        ticket.setFrom(f2.getStartLocation());
        ticket.setTo(f2.getEndLocation());
        ticket.setPassengerName(c2.getCustomerName());
        ticket.setSeatNo(f2.getAirplane().getSeats().get(0));
        f2.getAirplane().getSeats().get(0).setIsAvailable(false);
        c2.getLstTicket().add(ticket);
        
        //Assigning ticket to some customers:
        Ticket ticket3 = new Ticket();
        //Get one flight assoiated with this
        Airliner a3 = config.configureAirlines().getLstAirliner().get(1);
        Flight f3 = a.getFlightSchedule().getLstFlights().get(0);
        ticket.setFlightDate(f3.getStartTime());
        ticket.setFrom(f3.getStartLocation());
        ticket.setTo(f3.getEndLocation());
        ticket.setPassengerName(c3.getCustomerName());
        ticket.setSeatNo(f3.getAirplane().getSeats().get(0));
        f3.getAirplane().getSeats().get(0).setIsAvailable(false);
        c3.getLstTicket().add(ticket);
        
        return cd;
    }
    
    public static List<Admin> generateAdmin(){
        List<Admin> lstAdmin = new ArrayList();
        Admin a = new Admin("admin", "admin");
        lstAdmin.add(a);
//        Admin a2 = new Admin("Admin*1", "admin_1@gmail.com");
//        lstAdmin.add(a2);
        return lstAdmin;
    }
}
