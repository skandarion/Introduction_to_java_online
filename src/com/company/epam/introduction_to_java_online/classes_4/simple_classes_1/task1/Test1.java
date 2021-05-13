package com.company.epam.introduction_to_java_online.classes_4.simple_classes_1.task1;

//Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод,
// который находит наибольшее значение из этих двух переменных.

public class Test1 {
    private int a = 1;
    private int b = 2;

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
