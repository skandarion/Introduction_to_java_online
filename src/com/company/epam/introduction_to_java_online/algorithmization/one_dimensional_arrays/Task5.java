package com.company.epam.introduction_to_java_online.algorithmization.one_dimensional_arrays;

public class Task5 {
    public void getResult(int n) {
        int[] array = new int[n];
        // заполнение рамдомными целыми числами
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 200 - 100);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("");

        for (int i = 0; i < array.length; i++){
            if (array[i] > i) System.out.print(array[i] + "\t");
        }
    }
}
