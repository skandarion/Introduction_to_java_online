package com.company.epam.introduction_to_java_online.classes_4.aggregation_composition_2.task5;

public class Tour implements Comparable<Tour>{
    private String tourName;
    private String tourType;
    private int numberOFDays;
    private String typeOfTransport;
    private String nutrition;

    public Tour(String tourName, String tourType, int numberOFDays, String typeOfTransport, String nutrition) {
        this.tourName = tourName;
        this.tourType = tourType;
        this.numberOFDays = numberOFDays;
        this.typeOfTransport = typeOfTransport;
        this.nutrition = nutrition;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getTourType() {
        return tourType;
    }

    public void setTourType(String tourType) {
        this.tourType = tourType;
    }

    public int getNumberOFDays() {
        return numberOFDays;
    }

    public void setNumberOFDays(int numberOFDays) {
        this.numberOFDays = numberOFDays;
    }

    public String getTypeOfTransport() {
        return typeOfTransport;
    }

    public void setTypeOfTransport(String typeOfTransport) {
        this.typeOfTransport = typeOfTransport;
    }

    public String getNutrition() {
        return nutrition;
    }

    public void setNutrition(String nutrition) {
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        return  "tourName: " + tourName +
                ", tourType: " + tourType +
                ", numberOFDays: " + numberOFDays +
                ", typeOfTransport: " + typeOfTransport +
                ", nutrition: " + nutrition;
    }

    @Override
    public int compareTo(Tour o) {
        if(this.numberOFDays == o.numberOFDays){
            return 0;
        }
        else if(this.numberOFDays < o.numberOFDays){
            return -1;
        }
        else return 1;
    }
}
