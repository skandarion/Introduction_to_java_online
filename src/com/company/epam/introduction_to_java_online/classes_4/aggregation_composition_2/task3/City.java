package com.company.epam.introduction_to_java_online.classes_4.aggregation_composition_2.task3;

public class City {
    private String cityName;

    public City(String cityName) {
        this.cityName = cityName;
    }

    public City() {
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
