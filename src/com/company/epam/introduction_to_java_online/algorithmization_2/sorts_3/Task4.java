package com.company.epam.introduction_to_java_online.algorithmization_2.sorts_3;

//Сортировка обменами

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        int n = 10;
        // создание и заполнение исходного массива согласно условию
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(array);

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        // сортировка обменами
        int count = 0;
        boolean flag = false;
        while (flag == false){
            flag = true;
            for(int i = 0; i < n -1; i++){
                if(array[i] < array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = false;
                    count++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\ncount is " + count);
    }
}
