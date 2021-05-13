package com.company.epam.introduction_to_java_online.classes.simple_classes.task5;

public class Task5 {
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
