package com.company.epam.introduction_to_java_online.algorithmization.multidimensional_arrays;

public class Task5 {
    public void getResult(int n) {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int[][] array = new int[n][n];
        int temp = n;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < temp; j++) {
                array[i][j] = i + 1;
            }
            temp--;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
