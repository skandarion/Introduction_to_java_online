package com.company.epam.introduction_to_java_online.basics_1.cycles_3;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 2 integers");
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();
        for (int i = m; i <= n; i++){
            System.out.print("divisors of " + i + ": ");
            for (int j = 2; j < i; j ++){
                if(i % j == 0) {
                    System.out.print(j + " ");
                }
            }
            System.out.println("");
        }
    }
}
