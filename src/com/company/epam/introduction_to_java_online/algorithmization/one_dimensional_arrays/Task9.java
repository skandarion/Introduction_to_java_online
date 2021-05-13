package com.company.epam.introduction_to_java_online.algorithmization.one_dimensional_arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task9 {
    public void getResult(int n) {
        int[] array = new int[n];
        // заполнение массива рамдомными целыми числами
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");
        //создание массива ключей для array
        int[] array2 = new int[n];
        for(int i = 0; i < array2.length; i ++){
            array2[i] = 1;
        }
        // заполнение массива ключей количеством одинаковых значений в array
        for (int i = 0; i < n - 1; i++){
            for (int j = 0; j < n - 1 && j != i; j++)
                if (array[i] == array[j]){
                array2[i]++;
            }
        }
        //вывод
        for (int i = 0; i < n; i++) {
            System.out.print(array2[i] + "\t");
        }
        System.out.println("");

        int max = array2[0];
        for (int i = 0; i < n; i++){
            if(array2[i] > max) max = array2[i];
        }

        List<Integer> array3 = new ArrayList<Integer>();
        for (int i = 0; i < n; i++){
            if(array2[i] == max)
                array3.add(array[i]);
            }
        System.out.println(Collections.min(array3));
        }
    }

