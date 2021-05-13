package com.company.epam.introduction_to_java_online.basics_1.conditions_2;

//Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.

public class Task3 {
    public static void main(String[] args) {
        getResult(2,4,6,7,8,3);
    }
    public static void getResult (double x1, double y1, double x2, double y2, double x3, double y3){
        double a1 = x2 - x1;
        double b1 = y2 - y1;
        double a2 = x3 - x2;
        double b2 = y3 - y2;
        if (a1/b1 == a2/b2) System.out.println("on the same line");
        else System.out.println("on the different lines");
    }

}
