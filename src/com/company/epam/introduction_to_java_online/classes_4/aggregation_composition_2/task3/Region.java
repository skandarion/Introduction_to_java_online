package com.company.epam.introduction_to_java_online.classes_4.aggregation_composition_2.task3;

import java.util.ArrayList;

public class Region {
    private String regionName;
    ArrayList<District> districtsList = new ArrayList<District>();
    String regionCenter;
    int area;

    public Region(String regionName, ArrayList<District> districtsList) {
        this.regionName = regionName;
        this.districtsList = districtsList;
        regionCenter = districtsList.get(0).citiesList.get(0).getCityName();
        for(District d : districtsList){
            this.area = this.area + d.area;
        }
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }
}
