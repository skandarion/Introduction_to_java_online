package com.company.epam.introduction_to_java_online.algorithmization.sorts;

import java.util.Arrays;

public class Task5 {
    public void getResult() {
        int n = 10;
        // создание и заполнение исходного массива согласно условию
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");

        //сортировка
        for (int i = 1; i < n; i++){
            int key = array[i];
            int low = 0; int high = i-1;
            int index = search(array,key,low,high);
            for(int j = i; j > index; j--){
                array[j] = array[j-1];
            }
            array[index] = key;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");



    }
    //метод бинарного поиска
    public static int search(int[] sortedArray, int key, int low, int high){
        int index = 0;
        while (low <= high) {

            int mid = (low + high) / 2;
            if ( key == sortedArray[mid]){
                index = mid;
                break;
            }
            else if (key < sortedArray[mid]) {
                high = mid -1;
            } else if (key > sortedArray[mid]) {
                low = mid +1;
                index = low;
            }

        }
        return index;
    }
}
