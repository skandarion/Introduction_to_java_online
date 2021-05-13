package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task3;

public class Student {
    String lastName;
    String initials;
    String groupNumber;
    int[] grades = new int[5];

    Student (String lastName, String initials, String groupNumber, int[] grades){
        this.lastName = lastName;
        this.initials = initials;
        this.groupNumber = groupNumber;
        this.grades = grades;
    }
    public void printInfo(){
        System.out.println(lastName + " " + groupNumber );
    }
}
