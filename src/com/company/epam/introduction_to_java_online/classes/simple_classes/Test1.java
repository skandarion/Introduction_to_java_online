package com.company.epam.introduction_to_java_online.classes.simple_classes;

public class Test1 {
    int a = 1;
    int b = 2;

    public void print (){
        System.out.println(a + " " + b);
    }
    public void setA (int a){
        this.a = a;
    }
    public void setB (int b){
        this.b = b;
    }
    public int sum (){
        return a + b;
    }
    public int greatestOne(){
        if(a > b){
            return a;
        }
        else return b;
    }
}
