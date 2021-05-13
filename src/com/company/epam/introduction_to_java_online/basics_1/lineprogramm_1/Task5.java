package com.company.epam.introduction_to_java_online.basics_1.lineprogramm_1;

//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//Вывести данное значение длительности в часах, минутах и секундах в следующей форме: ННч ММмин SSc.

public class Task5 {
    public static void main(String[] args) {
        getDate(1000);
    }
    public static void getDate (int x) {
        int h = x / 3600;
        int m = x / 60;
        int c = x - (((int)(x / 60) * 60));
        System.out.println(h + "ч "  + m + "мин " + c +"сек");
    }
}
