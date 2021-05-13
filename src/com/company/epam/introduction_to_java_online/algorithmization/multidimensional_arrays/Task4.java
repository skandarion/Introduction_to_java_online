package com.company.epam.introduction_to_java_online.algorithmization.multidimensional_arrays;

public class Task4 {
    public void getResult(int n) {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i ++) {
            if((i+1)%2 == 0){
                for (int k = 0; k < n; k++)
                    array[i][k] = n - k;
            } else
                for (int j = 0; j < n; j++)
                    array[i][j] = j +1;
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
