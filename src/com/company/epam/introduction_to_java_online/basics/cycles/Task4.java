package com.company.epam.introduction_to_java_online.basics.cycles;

import java.math.BigInteger;

public class Task4 {
    public void getResult(){
        BigInteger с = BigInteger.valueOf(1);
        for(int i = 1; i <= 200; i++){
            с = с.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(с);
    }
}
