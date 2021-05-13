package com.company.epam.introduction_to_java_online.basic_oop_5.task4.treasures;

public class Ring extends Treasure{
    private final static String name = "ring";
    public Ring(double cost, TypeOfMaterial typeOfMaterial) {
        super(name, cost, typeOfMaterial);
    }
}
