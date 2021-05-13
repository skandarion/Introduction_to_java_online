package com.company.epam.introduction_to_java_online.algorithmization_2.multidimensional_arrays_2;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

public class Task15 {
    public static void main(String[] args) {
        getResult();
    }
    public static void getResult() {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int n = 5, m = 5;
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
        // нахождение наибольшего элемента
        int max = array[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > max)
                    max = array[i][j];

            }
        }
        System.out.println(max);
        System.out.println("");
        // замена
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
