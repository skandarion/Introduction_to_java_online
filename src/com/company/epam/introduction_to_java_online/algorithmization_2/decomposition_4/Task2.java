package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Task2 {
    public static void main(String[] args) {
        int temp = nod4(5,10,50,100);
        System.out.println(temp);
    }
    public static int nod (int a, int b){
        if (b == 0){
            return a;
        }
        else {
            return nod(b, a%b);
        }
    }
    public static int nod4 (int a, int b, int c, int d){
        return nod(nod(a,b),nod(c,d));
    }

}
