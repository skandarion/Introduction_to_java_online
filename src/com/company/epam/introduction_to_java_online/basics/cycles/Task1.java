package com.company.epam.introduction_to_java_online.basics.cycles;

import java.util.Scanner;

public class Task1 {
    public void getResult(){
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
