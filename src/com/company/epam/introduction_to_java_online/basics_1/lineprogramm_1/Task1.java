package com.company.epam.introduction_to_java_online.basics_1.lineprogramm_1;

//Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

public class Task1 {
    public static void main(String[] args) {
        double result = findZ(3,4,5);
        System.out.println(result);
    }

    public static double findZ (double a, double b, double c) {
        double z;
        z = ((a - 3) * b / 2) - c;
        return z;
    }
}
