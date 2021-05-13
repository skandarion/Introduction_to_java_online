package com.company.epam.introduction_to_java_online.classes.aggregation_composition.task3;

import java.util.ArrayList;

public class Country {
    private String countryName;
    City capital;

    ArrayList<Region> regionsList = new ArrayList<Region>();

    public Country(String countryName, ArrayList<Region> regionsList) {
        this.countryName = countryName;
        this.regionsList = regionsList;
        capital = new City();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    public void printCapital(){
        System.out.println(capital.getCityName());
    }
    public void printNumberOfRegions(){
        System.out.println(regionsList.size());
    }
    public void printRegionalCenters(){
        for(Region r : regionsList){
            System.out.println(r.regionCenter);
        }
    }
    public void printCountryArea(){
        int sumofareas = 0;
        for(Region r : regionsList){
            sumofareas = sumofareas + r.area;
        }
        System.out.println(sumofareas + "km2");
    }
}
