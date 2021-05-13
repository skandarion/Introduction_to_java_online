package com.company.epam.introduction_to_java_online.basics_1.conditions_2;

//Даны два угла треугольника (в градусах).
//Определить, существует ли такой треугольник,и если да, то будет ли он прямоугольным.

public class Task1 {
    public static void main(String[] args) {
        result(90,45);
    }
    public static void result (int x, int y){
        if (x >= 180 || x <=0 || y >= 180 || y <= 0) System.out.println("error");
        else if (x+y >= 180) System.out.println("error");
        else if (x+y == 90) System.out.println("right triangle");
        else System.out.println("non-right triangle");
    }
}
