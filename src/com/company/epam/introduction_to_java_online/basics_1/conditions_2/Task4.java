package com.company.epam.introduction_to_java_online.basics_1.conditions_2;

//Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича.
// Определить, пройдет ли кирпич через отверстие.

public class Task4 {
    public static void main(String[] args) {
        getResult(2,6,3,1,6);
    }
    public static void getResult(double A, double B, double x, double y, double z){
        if(     (x <= A && y <= B) || (y <= A && x <= B) ||
                (y <= A && z <= B) || (z <= A && y <= B) ||
                (x <= A && z <= B) || (z <= A && x <= B)){
            System.out.println("pass-through");
        }
        else System.out.println("non-pass-through");
    }
}
