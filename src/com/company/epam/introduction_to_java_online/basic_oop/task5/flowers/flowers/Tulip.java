package com.company.epam.introduction_to_java_online.basic_oop.task5.flowers.flowers;

public class Tulip implements Flower {
    private final String name = "tulip";
    private int cost = 300;

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
