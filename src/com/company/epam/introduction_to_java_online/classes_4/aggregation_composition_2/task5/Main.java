package com.company.epam.introduction_to_java_online.classes_4.aggregation_composition_2.task5;

//Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
// Учитывать возможность выбора транспорта, питания и числа дней.
// Реализовать выбор и сортировку путевок.
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tour t1 = new Tour("tour №1", "cruise", 15, "ship", "three times a day");
        Tour t2 = new Tour("tour №2", "cruise", 10, "ship", "three times a day");
        Tour t3 = new Tour("tour №3", "cruise", 5, "ship", "three times a day");
        Tour t4 = new Tour("tour №4", "treatment", 5, "bus", "two times a day");
        Tour t5 = new Tour("tour №5", "treatment", 7, "train", "two times a day");
        Tour t6 = new Tour("tour №6", "rest", 5, "airplane", "one times a day");
        Tour t7 = new Tour("tour №7", "rest", 11, "airplane", "one times a day");
        Tour t8 = new Tour("tour №8", "rest", 5, "train", "two times a day");
        Tour t9 = new Tour("tour №9", "rest", 11, "ship", "two times a day");
        TourList tl = new TourList("firstTourList");
        tl.addTourAtList(t1,t2,t3,t4,t5,t6,t7,t8,t9);

        int choice = 0;
       while(true){
           System.out.println("enter option: \n" +
                   "1. sort tours by number of days\n" +
                   "2. sort tours by type\n" +
                   "3. sort tours by type of transport\n" +
                   "4. choose tours by transport\n" +
                   "5. choose tours by number of days\n" +
                   "6. choose tours by nutrition\n" +
                   "0. exit");
           Scanner sc = new Scanner(System.in);
           int temp = sc.nextInt();
           if(temp > 6 || temp < 0) {
               System.out.println("try againt");
               continue;
           }
           if(temp == 0) break;
           choice = temp;
           break;
       }
       switch (choice){
           case 1:
               Collections.sort(tl.tourList);
               tl.printInfo();
               break;
           case 2:
                Collections.sort(tl.tourList, new ComparatorByType());
                tl.printInfo();
               break;
           case 3:
               Collections.sort(tl.tourList, new ComparatorByTransport());
               tl.printInfo();
               break;
           case 4:
               System.out.println("enter type of transport you would like to travel: ship, bus, train, airplane");
               Scanner sc1 = new Scanner(System.in);
               String temp1 = sc1.nextLine();
               tl.printToursByTransport(temp1);
               break;
           case 5:
               System.out.println("enter how much days you would like to be on tour");
               System.out.println("from");
               Scanner sc2 = new Scanner(System.in);
               int temp2 = sc2.nextInt();
               System.out.println("to");
               int temp3 = sc2.nextInt();
               tl.printToursByDays(temp2,temp3);
               break;
           case 6:
               System.out.println("enter type of nutrition: one, two, three");
               Scanner sc3 = new Scanner(System.in);
               String temp4 = sc3.nextLine();
               tl.printToursByNutrition(temp4);
               break;
       }
    }
}
