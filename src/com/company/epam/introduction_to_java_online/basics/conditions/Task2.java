package com.company.epam.introduction_to_java_online.basics.conditions;

public class Task2 {
    public void getResult(double a, double b, double c, double d) {
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
