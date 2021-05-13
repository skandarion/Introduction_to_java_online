package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
// Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2.
// Для решения задачи использовать декомпозицию.

public class Task13 {
    public static void main(String[] args) {
        getResult(99);
    }
    public static void getResult(int n){
        for(int i = n; i <= 2*n; i++){
            if(isPrime(i) && isPrime(i+2)){
                System.out.println(i + " " + (i+2) + " - числа близнецы");
            }
        }
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
