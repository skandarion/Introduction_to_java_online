package com.company.epam.introduction_to_java_online.algorithmization_2.one_dimensional_arrays_1;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

public class Task10 {
    public static void main(String[] args) {
        getResult(10);
    }
    public static void getResult(int n) {
        int[] array = new int[n];
        // заполнение массива рамдомными целыми числами
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");

        for (int i = 1; i < n; i = i +2){
            array[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
