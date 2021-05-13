package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task5;

//Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
// на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
// произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
// получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class Main {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter(5, 10, 5);
        System.out.println(c1.getCurrent());
        System.out.println(c2.getCurrent());
        for (int i = 0; i < 6; i++) {
            c1.increase();
        }
        for (int i = 0; i < 6; i++) {
            c2.increase();
        }
        System.out.println(c1.getCurrent());
        System.out.println(c2.getCurrent());
        for (int i = 0; i < 11; i++) {
            c1.decrease();
        }
        for (int i = 0; i < 11; i++) {
            c2.decrease();
        }
        System.out.println(c1.getCurrent());
        System.out.println(c2.getCurrent());
    }
}
