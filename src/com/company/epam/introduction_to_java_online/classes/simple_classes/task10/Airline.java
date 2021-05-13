package com.company.epam.introduction_to_java_online.classes.simple_classes.task10;

public class Airline {
    private String destination;
    private int airlineNumber;
    private int flightNumber;
    private String TypeOfAirplane;
    private String departureTime;
    private String dayOfWeek;

    public Airline(String destination, int airlineNumber, int flightNumber, String typeOfAirplane, String departureTime, String dayOfWeek) {
        this.destination = destination;
        this.airlineNumber = airlineNumber;
        this.flightNumber = flightNumber;
        TypeOfAirplane = typeOfAirplane;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getAirlineNumber() {
        return airlineNumber;
    }

    public void setAirlineNumber(int airlineNumber) {
        this.airlineNumber = airlineNumber;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getTypeOfAirplane() {
        return TypeOfAirplane;
    }

    public void setTypeOfAirplane(String typeOfAirplane) {
        TypeOfAirplane = typeOfAirplane;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        return "destination='" + destination + '\'' +
                ", airlineNumber=" + airlineNumber +
                ", flightNumber=" + flightNumber +
                ", TypeOfAirplane='" + TypeOfAirplane + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", dayOfWeek='" + dayOfWeek;
    }
}
