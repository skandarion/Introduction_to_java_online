package com.company.epam.introduction_to_java_online.classes.simple_classes.task10;

import java.util.ArrayList;

public class Airlines {
    ArrayList<Airline> airlines = new ArrayList<Airline>();

    public void addAirlineToAirlines (Airline airline){
        airlines.add(airline);
    }

    public void printAirlinesByDestination (String destination){
        for(Airline airline: airlines){
            if(airline.getDestination().equalsIgnoreCase(destination)){
                System.out.println(airline.toString());
            }
        }
    }
    public void printAirlinesByDayOfWeek (String day){
        for(Airline airline: airlines){
            if(airline.getDayOfWeek().equalsIgnoreCase(day)){
                System.out.println(airline.toString());
            }
        }
    }
    public void printAirlinesByDayOfWeekAndDepartureTime (String day, String departureTime){
        for(Airline airline: airlines){
            if(airline.getDayOfWeek().equalsIgnoreCase(day) && airline.getDepartureTime().compareTo(departureTime) > 0){
                System.out.println(airline.toString());
            }
        }
    }

}
