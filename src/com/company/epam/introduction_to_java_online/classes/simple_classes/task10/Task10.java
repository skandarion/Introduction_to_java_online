package com.company.epam.introduction_to_java_online.classes.simple_classes.task10;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Airlines airlines = new Airlines();
        airlines.addAirlineToAirlines(new Airline("Tokyo", 123, 5452, "airbus", "15:40", "monday"));
        airlines.addAirlineToAirlines(new Airline("Moscow", 345, 1554, "jet", "09:20", "sunday"));
        airlines.addAirlineToAirlines(new Airline("London", 152, 8542, "airbus", "12:30", "sunday"));

        int choice = 0;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the action: \n" +
                    "1. List of airlines by destination\n" +
                    "2. List of airlines by day of week\n" +
                    "3. List of airlines by day of week and departure time\n" +
                    "0. exit");
            int temp = scanner.nextInt();
            if(temp == 0) {System.out.println("bye bye");break;}
            else if(temp < 1 || temp > 3){
                System.out.println("try againt");
                continue;
            }
            choice = temp;
            break;
        }
        switch (choice){
            case 1:
                Scanner scanner1 = new Scanner(System.in);
                System.out.println("enter the destination: ");
                String temp1 = scanner1.nextLine();
                airlines.printAirlinesByDestination(temp1);
                break;
            case 2:
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("enter the day: ");
                String temp2 = scanner2.nextLine();
                airlines.printAirlinesByDayOfWeek(temp2);
                break;
            case 3:
                Scanner scanner3 = new Scanner(System.in);
                System.out.println("enter the day: ");
                String temp3 = scanner3.nextLine();
                System.out.println("enter the time: ");
                String temp4 = scanner3.nextLine();
                airlines.printAirlinesByDayOfWeekAndDepartureTime(temp3, temp4);
                break;
        }
    }
}
