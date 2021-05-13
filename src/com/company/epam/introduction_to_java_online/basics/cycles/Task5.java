package com.company.epam.introduction_to_java_online.basics.cycles;

public class Task5 {
    public void getResult(double a) {
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
