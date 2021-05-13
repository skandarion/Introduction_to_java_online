package com.company.epam.introduction_to_java_online.algorithmization_2.sorts_3;

//Сортировка выбором.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult(){
        int n = 10;
        // создание и заполнение исходного массива согласно условию
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(array);
        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        } System.out.println("");

        //сортировка выбором
        for(int i = 0; i < array.length; i ++){
            int maxIndex = i;
            for(int j = i+1; j < array.length; j++){
                if(array[j] > array[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[maxIndex];
            array[maxIndex] = temp;
        }

        for(int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        } System.out.println("");
    }
}
