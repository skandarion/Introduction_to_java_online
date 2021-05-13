package com.company.epam.introduction_to_java_online.classes.simple_classes.task4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        int number = 5;
        Train[] trainArray = new Train[number];

        trainArray[0] = new Train("Minsk",123,"13:40");
        trainArray[1] = new Train("Brest",12,"18:40");
        trainArray[2] = new Train("Minsk",13,"11:40");
        trainArray[3] = new Train("Grodno",18,"06:40");
        trainArray[4] = new Train("Brest",154,"15:40");


        Scanner scan = new Scanner(System.in);
        System.out.println("choose what to do:\n" +
                "1 - sort by number of train\n" +
                "2 - get information about the train\n" +
                "3 - sort by destination");
        int choice;
        while(true){
            int temp = scan.nextInt();
            if(temp == 1 || temp == 2 || temp == 3) {
                choice = temp;
                break;
            }
            else{
                System.out.println("wrong choice. try again!");
                continue;
            }
        }

        switch (choice){
            case 1:{
                Arrays.sort(trainArray);
                System.out.println(Arrays.toString(trainArray));
                break;
            }
            case 2:{
                System.out.println("enter index of train");
                int choosenTrain = scan.nextInt();
                if (choosenTrain < 0 || choosenTrain >= trainArray.length)
                    System.out.println("wrong index");
                else{
                    System.out.println(trainArray[choosenTrain].toString());
                }
                break;
            }
            case 3:{
                Comparator destinationComparator = new ComparatorByDestination();
                Arrays.sort(trainArray, destinationComparator);
                System.out.println(Arrays.toString(trainArray));
                break;
            }
        }
    }
}
