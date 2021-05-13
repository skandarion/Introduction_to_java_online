package com.company.epam.introduction_to_java_online.basic_oop_5.task4;

//Создать консольное приложение, удовлетворяющее следующим требованиям:
//• Приложение должно быть объектно-, а не процедурно-ориентированным.
//• Каждый класс должен иметь отражающее смысл название и информативный состав.
//• Наследование должно применяться только тогда, когда это имеет смысл.
//• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
//• Классы должны быть грамотно разложены по пакетам.
//• Консольное меню должно быть минимальным.
//• Для хранения данных можно использовать файлы.
//Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере дракона.
// Реализовать возможность просмотра сокровищ, выбора самого дорогого по стоимости сокровища и выбора сокровищ на заданную сумму.

import com.company.epam.introduction_to_java_online.basic_oop_5.task4.caves.DragonCave;

import java.io.*;
import java.util.Scanner;

public class Main {
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

