package com.company.epam.introduction_to_java_online.classes.aggregation_composition.task2;

public class Task2 {
    public static void main(String[] args) {
        Wheel w1 = new Wheel("summer");
        Wheel w2 = new Wheel("winter");
        Wheel w3 = new Wheel("winter");
        Wheel w4 = new Wheel("winter");
        Automobile a = new Automobile("VolksWagen", w1,w2,w3,w4);

        a.run();
        a.fullTank();
        a.run();
        a.changeWheel();
        a.run();
    }
}
