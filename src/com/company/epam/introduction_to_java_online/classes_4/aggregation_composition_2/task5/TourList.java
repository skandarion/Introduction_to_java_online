package com.company.epam.introduction_to_java_online.classes_4.aggregation_composition_2.task5;

import java.util.ArrayList;

public class TourList {
    private String tourListName;
    ArrayList<Tour> tourList;

    public TourList(String tourListName) {
        this.tourListName = tourListName;
        tourList = new ArrayList<Tour>();
    }
    public void addTourAtList(Tour ... tour){
        for(Tour t : tour){
            tourList.add(t);
        }
    }

    public String getTourListName() {
        return tourListName;
    }

    public void setTourListName(String tourListName) {
        this.tourListName = tourListName;
    }
    public void printInfo(){
        for(Tour t : tourList){
            System.out.println(t.toString());
        }
    }
    public void printToursByTransport(String transport){
        for(Tour t : tourList){
            if(t.getTypeOfTransport().equalsIgnoreCase(transport)){
                System.out.println(t.toString());
            }
        }
    }
    public void printToursByDays(int from, int to){
        for(Tour t : tourList){
            if(t.getNumberOFDays() >= from && t.getNumberOFDays() <= to){
                System.out.println(t.toString());
            }
        }
    }
    public void printToursByNutrition(String nutrition){
        for(Tour t : tourList){
            if(t.getNutrition().contains(nutrition)){
                System.out.println(t.toString());
            }
        }
    }
}
