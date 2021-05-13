package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
// массива с номерами от k до m.

public class Task8 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult(){
        int n = 6;
        int[] array = new int[n];
        setArray(array);
        printArray(array);
        System.out.println(sum(1,3,array));
        System.out.println(sum(3,5,array));
        System.out.println(sum(4,6,array));
    }

    public static int sum (int k, int m, int[] array){ // n и m номер элементов в массиве
        int sum = 0;
        for(int i = k-1; i < m; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public static void setArray (int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
    }
    public static void printArray (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        } System.out.println("");
    }
}
