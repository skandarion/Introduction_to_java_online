package com.company.epam.introduction_to_java_online.basics_1.cycles_3;

//Найти сумму квадратов первых ста чисел.

public class Task3 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult(){
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            sum = sum + i*i;
        }
        System.out.println(sum);
    }
}
