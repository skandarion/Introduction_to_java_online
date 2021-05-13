package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел:

public class Task1 {
    public static void main(String[] args) {
    }

    public static int nod (int a, int b){
        if (b == 0){
            return a;
        }
        else {
            return nod(b,a%b);
        }
    }

    public static int nok (int a, int b){
        return a*b/nod(a,b);
    }
}
