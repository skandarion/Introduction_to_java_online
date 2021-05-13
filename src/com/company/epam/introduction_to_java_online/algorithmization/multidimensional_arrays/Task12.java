package com.company.epam.introduction_to_java_online.algorithmization.multidimensional_arrays;

public class Task12 {
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
        for (int k = 0; k < n; k++){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (array[k][j] > array[k][j + 1]) {
                        int temp = array[k][j];
                        array[k][j] = array[k][j + 1];
                        array[k][j + 1] = temp;
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
        //  по убыванию
        for (int k = 0; k < n; k++){
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < m - 1; j++) {
                    if (array[k][j] < array[k][j + 1]) {
                        int temp = array[k][j];
                        array[k][j] = array[k][j + 1];
                        array[k][j + 1] = temp;
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
