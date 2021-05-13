package com.company.epam.introduction_to_java_online.basics.lineprogramm;

public class Task4 {
    public void findResult (double x){
        double y = ((x * 1000) % 1000) + (int)x / 1000.0;
        System.out.println(y);
    }

}
