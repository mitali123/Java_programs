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
import java.util.Date;

/**
 *
 * @author phapa
 */
public class config {

    public static AirlinerDirectory configure() {

        AirlinerDirectory airlinerDirectory = new AirlinerDirectory();

        //adding FIRST airliner
        Airliner airliner = new Airliner();    //dont know when to use get Instance method
        airliner.setAirlinerName("British Airways");

        //Adding First plane
        Airplane ap = new Airplane();
        ap.setAirplaneType("Airbus");
        ap.setModel("A320");
        //ap.setNumberOfSeats(50);

        Fleet fleet = new Fleet();
        fleet.getLstAirplane().add(ap);

        airliner.setFleet(fleet);
        airlinerDirectory.getLstAirliner().add(airliner);

        //Adding one flight schedule to the airliner
        Flight flight = new Flight();
        flight.setStartLocation("Boston");
        flight.setEndLocation("New York");
        flight.setStartTime(new Date());
        flight.setEndTime(new Date());
        flight.setDuration("11");
        flight.setAirplane(ap);
        FlightSchedule fs = new FlightSchedule();
        fs.getLstFlights().add(flight);
        airliner.setFlightSchedule(fs);

        Airliner airliner2 = new Airliner();    //dont know when to use get Instance method
        airliner2.setAirlinerName("Etihad");

        //Adding First plane
        Airplane ap2 = new Airplane();
        ap2.setAirplaneType("Airbus");
        ap2.setModel("A320");
        //ap2.setNumberOfSeats(50);

        Fleet fleet2 = new Fleet();
        fleet2.getLstAirplane().add(ap2);

        airliner2.setFleet(fleet);
        airlinerDirectory.getLstAirliner().add(airliner2);

        //Adding one flight schedule to the airliner
        Flight flight2 = new Flight();
        flight2.setStartLocation("Boston");
        flight2.setEndLocation("New York");
        flight2.setStartTime(new Date());
        flight2.setEndTime(new Date());
        flight2.setDuration("11");
        flight2.setAirplane(ap2);
        FlightSchedule fs2 = new FlightSchedule();
        fs2.getLstFlights().add(flight);
        airliner2.setFlightSchedule(fs);


        return airlinerDirectory;
    }
}
