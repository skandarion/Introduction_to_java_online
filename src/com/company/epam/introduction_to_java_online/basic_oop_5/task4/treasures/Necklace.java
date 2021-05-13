package com.company.epam.introduction_to_java_online.basic_oop_5.task4.treasures;

public class Necklace extends Treasure{
    private final static String name = "necklace";
    public Necklace(double cost, TypeOfMaterial typeOfMaterial) {
        super(name, cost, typeOfMaterial);
    }
}
