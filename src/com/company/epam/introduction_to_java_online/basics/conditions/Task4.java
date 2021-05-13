package com.company.epam.introduction_to_java_online.basics.conditions;

public class Task4 {
    public void getResult(double A, double B, double x, double y, double z){
        if(     (x <= A && y <= B) || (y <= A && x <= B) ||
                (y <= A && z <= B) || (z <= A && y <= B) ||
                (x <= A && z <= B) || (z <= A && x <= B)){
            System.out.println("pass-through");
        }
        else System.out.println("non-pass-through");
    }
}
