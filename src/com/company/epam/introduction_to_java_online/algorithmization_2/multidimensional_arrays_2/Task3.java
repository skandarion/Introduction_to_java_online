package com.company.epam.introduction_to_java_online.algorithmization_2.multidimensional_arrays_2;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        int k =3, p = 7;
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

        // вывод строки
        System.out.println(Arrays.toString(array[k-1]));
        // вывод столбца
        for(int i = 0; i < n; i++){
            System.out.print(array[i][p-1] +"\t");
        }
    }
}
