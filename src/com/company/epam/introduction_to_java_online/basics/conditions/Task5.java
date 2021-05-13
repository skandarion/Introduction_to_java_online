package com.company.epam.introduction_to_java_online.basics.conditions;

public class Task5 {
    public void getResult(double x){
        if (x <= 3) {
            System.out.println(x*x - 3*x + 9);
        }
        else System.out.println(1/(Math.pow(x,3)+6));
    }
}
