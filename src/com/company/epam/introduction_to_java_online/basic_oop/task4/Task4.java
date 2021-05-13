package com.company.epam.introduction_to_java_online.basic_oop.task4;

import com.company.epam.introduction_to_java_online.basic_oop.task4.caves.DragonCave;
import com.company.epam.introduction_to_java_online.basic_oop.task4.treasures.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) throws IOException{
        DragonCave cave = new DragonCave("Aaron");
        cave.setTreasuresFromFile("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\basic_oop\\task4\\treasures.txt");
        int mainchoice = 0;
        while (true){
            System.out.println("enter the option: \n" +
                    "1. Treasure list\n" +
                    "2. Most expensive treasure\n" +
                    "3. Treasures by summ\n" +
                    "0. exit");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            if(choice > 3 || choice < 0){
                System.out.println("try again");
                continue;
            }
            mainchoice = choice;
            break;
        }
        switch (mainchoice){
            case 0: {
                break;
            }
            case 1:{
                cave.showTeasures();
                break;
            }
            case 2: {
                cave.showMostExpensive();
                break;
            }
            case 3: {
                Scanner sc = new Scanner(System.in);
                System.out.println("enter the summ: ");
                double summ = sc.nextDouble();
                cave.getTreasuresByTotalCost(summ);
            }
        }
    }
}

