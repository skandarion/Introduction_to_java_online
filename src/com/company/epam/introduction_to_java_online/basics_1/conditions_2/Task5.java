package com.company.epam.introduction_to_java_online.basics_1.conditions_2;

//Вычислить значение функции:

public class Task5 {
    public static void main(String[] args) {
        getResult(10);
    }

    public static void getResult(double x){
        double result;
        if (x <= 3) {
            result = x*x - 3*x + 9;
        }
        else {
            result = 1/(Math.pow(x,3)+6);
        }
        System.out.println(result);
    }
}
