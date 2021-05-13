package com.company.epam.introduction_to_java_online.basic_oop.task1;

import java.util.Scanner;

public class Directory{
    private String dir = "D://";

    public void changeDir(){
        System.out.println("current dir: D://");
        Scanner sc = new Scanner(System.in);
        System.out.println("print dir");
        String temp = sc.nextLine();
        dir = temp;
    }

    public String getDir() {
        return dir;
    }
}
