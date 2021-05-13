package com.company.epam.introduction_to_java_online.classes.simple_classes.task6;

public class Task6 {
    public static void main(String[] args) {
       Time time = new Time();
       time.setTime();
       time.printTime();
       time.increaseSs(100000);
       time.printTime();
    }
}
