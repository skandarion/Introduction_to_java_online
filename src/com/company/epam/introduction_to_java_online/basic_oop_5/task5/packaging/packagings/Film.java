package com.company.epam.introduction_to_java_online.basic_oop_5.task5.packaging.packagings;

public class Film implements Packaging{
    private final String name = "film";
    private int cost = 50;

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
