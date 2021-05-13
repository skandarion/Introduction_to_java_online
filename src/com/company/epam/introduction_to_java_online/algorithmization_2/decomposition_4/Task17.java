package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

public class Task17 {
    public static void main(String[] args) {
        int result = countSubtraction(100);
        System.out.println(result);
    }
    public static int countSubtraction(int a){
        int count = 0;
        int temp = a;
        while(temp != 0){
            temp = temp - sumOfDigits(temp);
            count++;
        }
        return count;
    }
    public static int sumOfDigits (int a){
        int sum = 0;
        int t = a;
        while(t!=0){
            sum = sum + t%10;
            t = t/10;
        }
        return sum;
    }
}
