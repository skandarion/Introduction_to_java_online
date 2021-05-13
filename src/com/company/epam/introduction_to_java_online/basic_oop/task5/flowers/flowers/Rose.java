package com.company.epam.introduction_to_java_online.basic_oop.task5.flowers.flowers;

public class Rose implements Flower {
    private final String name = "rose";
    private int cost = 100;

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "name: " + name +", cost: " + cost;
    }
}
