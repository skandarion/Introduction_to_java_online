package com.company.epam.introduction_to_java_online.algorithmization_2.sorts_3;

//Даны две последовательности a1<=a2 и b1<=b2 . Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        int n = 10, m = 15;
        int[] array1 = new int[n];
        int[] array2 = new int[m];
        for (int i = 0; i < n; i++) {
            array1[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < m; i++) {
            array2[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i = 0; i < n; i++){
            System.out.print(array1[i] + " ");
        } System.out.println("");
        for(int i = 0; i < m; i++){
            System.out.print(array2[i] + " ");
        } System.out.println("");

        // создание и заполнение результирующего массива
        int k = Math.min(n,m);
        int[] array3 = new int[k];
        for (int i = 0; i < k; i++) {
            array3[i] = array1[i] + array2[i];
        }
        for(int i = 0; i < k; i++){
            System.out.print(array3[i] + " ");
        } System.out.println("");
    }
}
