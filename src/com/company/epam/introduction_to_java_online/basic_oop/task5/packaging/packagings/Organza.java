package com.company.epam.introduction_to_java_online.basic_oop.task5.packaging.packagings;

public class Organza implements Packaging{
    private final String name = "organza";
    private int cost = 70;

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
