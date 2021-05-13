package com.company.epam.introduction_to_java_online.basics_1.cycles_3;

//Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//заданному е. Общий член ряда имеет вид:\

public class Task5 {
    public static void main(String[] args) {
        getResult(0.1);
    }

    public static void getResult(double a) {
        double sum = 0;
        for (int i = 0; ; i++){
            double b = Math.abs(1/Math.pow(2,i) + 1/Math.pow(3,i));
            if(b >= a){
                sum = sum + b;
            }
            else break;
        }
        System.out.println(sum);
    }
}
