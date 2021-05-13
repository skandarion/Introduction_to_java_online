package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class Task7 {
    public static void main(String[] args) {
        sumFactorialOdd(1,99);
    }

    public static void sumFactorialOdd(int a, int b){ // сумма факториалов нечетных чисел от a до b
        int[] array = new int[b];
        int first = a;
        for(int i = 0; i < b; i++){
            array[i] = a;
            a++;
        }

        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]%2 != 0){
                sum = sum + factorial(array[i]);
            }
        }
        System.out.println("sum is " + sum);
    }
    public static int factorial (int a){ // нахождение факториала числа
        int[] array = new int[a];
        for(int i = 0; i < a; i++){
            array[i] = i+1;
        }
        int f = 1;
        if (a == 0){
            return 1;
        }
        else {
            for(int i = 0; i < a; i++){
                f = f*array[i];
            }
        }
        return f;
    }
    public static void printArray (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        } System.out.println("");
    }
}
