package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Task6 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        int a = setInteger();
        int b = setInteger();
        int c = setInteger();
        check(a,b,c);
    }

    public static void check (int a, int b, int c){
        if(isPrime(a) && isPrime(b) && isPrime(c)){
            System.out.println("numbers are coprime");
        }
        else System.out.println("numbers are not coprime");
    }
    public static int setInteger (){
        int i = (int)(Math.random()*10);
        System.out.println(i);
        return i;
    }

    public static boolean isPrime(int i) {            // проверка на простоту числа
        boolean check = true;
        if (i == 0 || i == 1) check = false;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
