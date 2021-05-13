package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task3;

//Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы,
// успеваемость (массив из пяти элементов). Создайте массив из десяти элементов такого типа.
// Добавьте возможность вывода фамилий и номеров групп студентов, имеющих оценки, равные только 9 или 10.

public class Main {
    public static void main(String[] args) {
        Task3 t3 = new Task3();
        t3.printExcellents();
    }
}
