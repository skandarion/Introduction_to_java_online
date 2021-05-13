package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task7 {
    public void sumFactorialOdd(int a, int b){ // сумма факториалов нечетных чисел от a до b
        int[] array = new int[b];
        int first = a;
        for(int i = 0; i < b; i++){
            array[i] = a;
            a++;
        }
        printArray(array);
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i]%2 != 0){
                sum = sum + factorial(array[i]);
            }
        }
        System.out.println("sum is " + sum);
    }
    public int factorial (int a){ // нахождение факториала числа
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
    public void printArray (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        } System.out.println("");
    }
}
