package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
// Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class Task16 {
    public static void main(String[] args) {
        getResult(10);
    }
    public static void getResult(int a){
        System.out.println(sum(a));
        System.out.println(countOfEvenDigits(sum(a)));
    }

    public static int sum (int n){
        int sum = 0;
        for(int i = firstNDigitNumber(n); i <= lastNDigitNumber(n); i ++){
            if(isOnlyOdd(i)){
                sum = sum + i;
            }
        }
        return sum;
    }

    public static boolean isOnlyOdd (int i){
        boolean result = true;
        int temp = i;
        while (temp != 0){
            int a = temp%10;
            temp = temp/10;
            if(a%2 == 0){
                result = false;
                break;
            }
        }
        return result;
    }
    public static int firstNDigitNumber(int n){
        int result = 1;
        for(int i = 1; i < n; i++){
            result = result*10;
        }
        return result;
    }
    public static int lastNDigitNumber(int n){
        int result = 1;
        for(int i = 0; i < n; i++){
            result = result*10;
        }
        return result - 1;
    }
    public static int countOfEvenDigits (int i){
        int count = 0;
        int temp = i;
        while(temp != 0){
            if(temp%2 == 0){
                count++;
            }
            temp = temp/10;
        }
        return count;
    }
}
