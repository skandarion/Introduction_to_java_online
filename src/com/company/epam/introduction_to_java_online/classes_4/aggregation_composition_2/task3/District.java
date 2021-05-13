package com.company.epam.introduction_to_java_online.classes_4.aggregation_composition_2.task3;

import java.util.ArrayList;

public class District {
    private String districtName;
    public ArrayList<City> citiesList = new ArrayList<City>();
    int area;

    public District(String districtName,int area, ArrayList citiesList) {
        this.districtName = districtName;
        this.citiesList = citiesList;
        this.area = area;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }
}
