package com.company.epam.introduction_to_java_online.algorithmization.multidimensional_arrays;

public class Task13 {
    public void getResult() {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int n = 5, m = 10;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                array[i][j] = (int) (Math.random() * 21 - 10);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        // по возрастанию
        for (int k = 0; k < m; k++){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (array[j][k] > array[j+1][k]) {
                        int temp = array[j][k];
                        array[j][k] = array[j+1][k];
                        array[j+1][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        // по убыванию
        for (int k = 0; k < m; k++){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n - 1; j++) {
                    if (array[j][k] < array[j+1][k]) {
                        int temp = array[j][k];
                        array[j][k] = array[j+1][k];
                        array[j+1][k] = temp;
                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }
}
