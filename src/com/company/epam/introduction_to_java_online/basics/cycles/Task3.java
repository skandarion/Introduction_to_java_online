package com.company.epam.introduction_to_java_online.basics.cycles;

public class Task3 {
    public void getResult(){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum = sum + i*i;
        }
        System.out.println(sum);
    }
}
