package com.company.epam.introduction_to_java_online.basics.cycles;

public class Task2 {
    public void getResult(double a, double b, double h){

        for(double i = a; i <=b; i = i + h){
            if (i <= 2) System.out.println(-i);
            else System.out.println(i);
        }
    }
}
