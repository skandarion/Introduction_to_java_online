package com.company.epam.introduction_to_java_online.algorithmization_2.sorts_3;

//Пусть даны две неубывающие последовательности действительных чисел.
//Требуется указать те места, на которые нужно вставлять элементы второй последовательности
//в первую последовательность так, чтобы новая последовательность оставалась возрастающей.

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        // создание и заполнение исходных массивов согласно условию
        int n = 5, m = 10;
        double[] array1 = new double[n];
        double[] array2 = new double[m];
        for (int i = 0; i < n; i++) {
            array1[i] = Math.random() * 20 - 10;
        }
        Arrays.sort(array1);
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < m; i++) {
            array2[i] = Math.random() * 20 - 10;
        }
        Arrays.sort(array2);
        for (int i = 0; i < m; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("");

        for (int i = 0; i < m; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (array2[i] < array1[j]) {
                    System.out.println(array2[i] + " перед " + array1[j]);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(array2[i] + " в конец");
            }
        }
    }
}
