package com.company.epam.introduction_to_java_online.basics_1.cycles_3;

//Вычислить значения функции на отрезке [а,b] c шагом h:

public class Task2 {
    public static void main(String[] args) {
        getResult(2,4,0.5);
    }

    public static void getResult(double a, double b, double h){
        for(double i = a; i <= b; i = i + h){
            if (i <= 2) System.out.println(-i);
            else System.out.println(i);
        }
    }
}
