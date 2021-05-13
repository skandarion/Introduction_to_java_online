package com.company.epam.introduction_to_java_online.classes.aggregation_composition.task3;

import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<City> cl1 = new ArrayList<City>();
        cl1.add(new City("Gomel"));
        cl1.add(new City("Uza"));
        ArrayList<City> cl2 = new ArrayList<City>();
        cl2.add(new City("Brest"));
        ArrayList<City> cl3 = new ArrayList<City>();
        cl3.add(new City("Minsk"));
        cl3.add(new City("Jodino"));

        ArrayList<District> dl1 = new ArrayList<District>();
        ArrayList<District> dl2 = new ArrayList<District>();
        District d1 = new District("gomelsky",1000, cl1);
        District d2 = new District("brestsky",2000, cl2);
        District d3 = new District("minsky",4000, cl3);
        dl1.add(d1);
        dl1.add(d2);
        dl2.add(d3);

        Region r1 = new Region("first",dl1);
        Region r2 = new Region("second",dl2);
        ArrayList<Region> rl = new ArrayList<Region>();
        rl.add(r1);
        rl.add(r2);

        Country country = new Country("Belarus",rl);
        country.capital.setCityName("Minsk");
        country.printCapital();
        country.printNumberOfRegions();
        country.printRegionalCenters();
        country.printCountryArea();
    }
}
