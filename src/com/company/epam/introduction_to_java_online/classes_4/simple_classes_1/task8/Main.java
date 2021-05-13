package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task8;

//Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
// и метод toString().
// Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
//Найти и вывести:
//a) список покупателей в алфавитном порядке;
//b) список покупателей, у которых номер кредитной карточки находится в заданном интервале

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Customers customers = new Customers();
        customers.setArray();
        Scanner scan = new Scanner(System.in);
        System.out.println("choose what to do:\n" +
                "1 - sort by name\n" +
                "2 - get information about customer with bankcards in intervale");
        int choice;
        while (true) {
            int temp = scan.nextInt();
            if (temp == 1 || temp == 2) {
                choice = temp;
                break;
            } else {
                System.out.println("wrong choice. try again!");
                continue;
            }
        }

        switch (choice) {
            case 1: {
                customers.ListSortedByName();
                break;
            }
            case 2: {
                System.out.println("enter start of intervale");
                int temp1 = scan.nextInt();
                System.out.println("enter end of intervale");
                int temp2 = scan.nextInt();
                customers.ListSortedByCard(temp1, temp2);
                break;
            }
        }
    }
}
