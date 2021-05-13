package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task9;

//Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
// Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
// Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bookshelf bookshelf = new Bookshelf();
        bookshelf.addBookToBookshelf(new Book("nameOfTheFirstBook", "Smith", "FirstPublisher", 1988, 300, 15, "Soft binding"));
        bookshelf.addBookToBookshelf(new Book("nameOfTheSecondBook", "Jones", "SecondPublisher", 1945, 400, 10, "Hard binding"));
        bookshelf.addBookToBookshelf(new Book("nameOfTheThirdBook", "Black, Smith", "ThirdPublisher", 1966, 200, 30, "Soft binding"));
        bookshelf.addBookToBookshelf(new Book("nameOfTheFourthBook", "Grey", "FirstPublisher", 2000, 100, 20, "Soft binding"));

        int choice = 0;
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("enter the action: \n1. list by author\n2. list by publisher\n3.list by year\n0. exit");
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
            case 1 :
                System.out.println("print name of author");
                Scanner scanner = new Scanner(System.in);
                String temp  = scanner.nextLine();
                bookshelf.printBookOfAuthor(temp);
                break;
            case 2 :
                System.out.println("print name of publisher");
                Scanner scanner2 = new Scanner(System.in);
                String temp2  = scanner2.nextLine();
                bookshelf.printBookOfPublisher(temp2);
                break;
            case 3 :
                System.out.println("print year");
                Scanner scanner3 = new Scanner(System.in);
                int temp3  = scanner3.nextInt();
                bookshelf.printBookAfterYear(temp3);
                break;

        }
    }
}
