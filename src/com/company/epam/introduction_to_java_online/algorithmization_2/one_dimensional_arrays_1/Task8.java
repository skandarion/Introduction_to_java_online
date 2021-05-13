package com.company.epam.introduction_to_java_online.algorithmization_2.one_dimensional_arrays_1;

//Дана последовательность целых чисел a1,a2 ... an. Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1,a2 ... an).

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        getResult(100);
    }

    public static void getResult(int n) {
        int[] array = new int[n];
        // заполнение массива рамдомными целыми числами
        for (int i = 0; i < n; i++) { array[i] = (int) (Math.random() * 200 - 100); }
        for (int i = 0; i < n; i++) { System.out.print(array[i] + "\t"); }
        System.out.println("");

        // нахождение минимального значения в массиве
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min) min = array[i];
        }

        // удаление значений из массива
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] == min){
                for(int j = i; j < array.length-1; j++){
                    array[j] = array[j+1];
                }
                count++;
            }
        }
        System.out.println(Arrays.toString(array));

        // перенос значений в новый массив
        int[] array2 = new int[n-count];
        for(int i = 0; i < array2.length; i++){
            array2[i] = array[i];
        }
        System.out.println(Arrays.toString(array2));
    }
}
