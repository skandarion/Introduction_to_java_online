package com.company.epam.introduction_to_java_online.basics_1.cycles_3;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.

public class Task6 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult(){
        char ch;
        for (int i = 0; i <= 127; i++){
            System.out.println(i + " - " + (char)i);
        }
    }
}
