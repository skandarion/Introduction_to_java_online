package com.company.epam.introduction_to_java_online.classes.simple_classes.task6;

import java.util.Scanner;

public class Time {
    int hh;
    int mm;
    int ss;

    public void setHh(int hh) {
        if(hh < 0 || hh > 23){
            this.hh = 0;
        }
        else this.hh = hh;
    }

    public void setMm(int mm) {
        if(mm < 0 || mm > 59){
            this.mm = 0;
        }
        else this.mm = mm;
    }

    public void setSs(int ss) {
        if(ss < 0 || ss > 59){
            this.ss = 0;
        }
        else this.ss = ss;
    }
    public void setTime (){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter hh");
        setHh(scanner.nextInt());
        System.out.println("enter mm");
        setMm(scanner.nextInt());
        System.out.println("enter ss");
        setSs(scanner.nextInt());
        scanner.close();
    }
    public void printTime(){
        System.out.println("current time is " + hh + ":" + mm + ":" + ss);
    }
    public void increaseHh (int hh){
        increaseSs(hh*3600);
        this.hh = this.hh%24;
    }
    public void increaseMm (int mm){
        increaseSs(mm*60);
        this.hh = this.hh%24;
    }
    public void increaseSs (int ss){
        int currentNumOfSec = this.hh*3600 + this.mm*60 + this.ss;
        int result = currentNumOfSec + ss;
        this.hh = result/3600;
        this.mm = (result - this.hh * 3600)/60;
        this.ss = result - this.hh * 3600 - this.mm*60;
        this.hh = this.hh%24;
    }
}
