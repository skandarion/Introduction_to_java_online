package com.company.epam.introduction_to_java_online.algorithmization.multidimensional_arrays;

public class Task10 {
    public void getResult() {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int n = 10, m = 10;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                array[i][j] = (int) (Math.random() * 20 - 10);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

        for (int i = 0; i < n; i++){
            if(array[i][i] > 0) System.out.print(array[i][i] + " ");
        }
    }
}
