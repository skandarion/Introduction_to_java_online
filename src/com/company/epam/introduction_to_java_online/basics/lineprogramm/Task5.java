package com.company.epam.introduction_to_java_online.basics.lineprogramm;


public class Task5 {

    public void getDate (int x) {
        int h = x / 3600;
        int m = x / 60;
        int c = x - (((int)(x/60)*60));
        System.out.println(h + "ч "  + m + "мин " + c +"сек");
    }
}
