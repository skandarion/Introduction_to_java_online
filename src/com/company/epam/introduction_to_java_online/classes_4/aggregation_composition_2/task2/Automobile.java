package com.company.epam.introduction_to_java_online.classes_4.aggregation_composition_2.task2;

import java.util.ArrayList;
import java.util.Scanner;

public class Automobile {
    String brandName;
    Engine engine;
    ArrayList<Wheel> wheels = new ArrayList<Wheel>();
    String tank = "empty";

    public Automobile(String brandName, Wheel... wheels) {
        this.brandName = brandName;
        for (Wheel w : wheels) {
            this.wheels.add(w);
        }
        this.engine = new Engine();
    }

    public void fullTank() {
        if (tank == "empty") {
            tank = "full";
        } else {
            System.out.println("the tank is full");
        }
    }

    public void run() {
        if (tank == "full" && isWheelsSame()) {
            System.out.println("run!");
        } else if (tank != "full") {
            System.out.println("full your tank");
        } else if (!isWheelsSame()){
            System.out.println("smth is wrong with your wheels");
        }
    }

    public void printBrandName() {
        System.out.println(brandName);
    }

    public void changeWheel() {
        System.out.println("enter season you wannna ride:\n" +
                "1. winter\n" +
                "2. summer");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.nextLine();
        if (season == "winter") {
            for (Wheel w : wheels) {
                w.setType("winter");
            }
        } else {
            for (Wheel w : wheels) {
                w.setType("summer");
            }
        }
    }
    private boolean isWheelsSame(){
        boolean result = false;
        for(int i = 0; i < wheels.size()-1; i++){
            if(wheels.get(i).getType().equalsIgnoreCase(wheels.get(i+1).getType())){
                result = true;
            }
            else return false;
        }
        return result;
    }
}
