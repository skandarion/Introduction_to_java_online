package com.company.epam.introduction_to_java_online.basics_1.cycles_3;

//Составить программу нахождения произведения квадратов первых двухсот чисел.

import java.math.BigInteger;

public class Task4 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult(){
        BigInteger с = BigInteger.valueOf(1);
        for(int i = 1; i <= 200; i++){
            с = с.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(с);
    }
}
