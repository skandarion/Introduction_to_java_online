package com.company.epam.introduction_to_java_online.basic_oop_5.task4.treasures;
import java.io.Serializable;

public abstract class Treasure implements Serializable {
    private String name;
    private double cost;
    private TypeOfMaterial typeOfMaterial;

    public Treasure(String name, double cost, TypeOfMaterial typeOfMaterial) {
        this.name = name;
        this.cost = cost;
        this.typeOfMaterial = typeOfMaterial;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Treasure: " + name + ", cost: " + cost + ", typeOfMaterial: " + typeOfMaterial;
    }
}
