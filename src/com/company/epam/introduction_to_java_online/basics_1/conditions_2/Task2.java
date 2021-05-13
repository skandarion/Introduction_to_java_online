package com.company.epam.introduction_to_java_online.basics_1.conditions_2;

//Найти max{min(a, b), min(c, d)}.

public class Task2 {
    public static void main(String[] args) {
        getResult(2.0,4.0,6.0, 3.0);
    }

    public static void getResult(double a, double b, double c, double d) {
        double minab, mincd, max;
        if (a < b) minab = a;
        else minab = b;

        if (c < d) mincd = c;
        else mincd = d;

        if (minab > mincd) max = minab;
        else max = mincd;

        System.out.println(max);
    }
}
