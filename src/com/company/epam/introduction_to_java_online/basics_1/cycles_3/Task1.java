package com.company.epam.introduction_to_java_online.basics_1.cycles_3;

//Напишите программу, где пользователь вводит любое целое положительное число.
// А программа суммирует все числа от 1 до введенного пользователем числа.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter positive integer");
        int number = in.nextInt();
        in.close();
        int sum = 0;
        for (int i = 1; i < number; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
