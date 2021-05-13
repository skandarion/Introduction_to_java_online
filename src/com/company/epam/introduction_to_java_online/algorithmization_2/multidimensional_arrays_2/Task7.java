package com.company.epam.introduction_to_java_online.algorithmization_2.multidimensional_arrays_2;

//Сформировать квадратную матрицу порядка N по правилу:
//A[I,J] = sin (I2 - J2)/N
//и подсчитать количество положительных элементов в ней.

public class Task7 {
    public static void main(String[] args) {
        getResult(4);
    }

    public static void getResult(int n) {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        double[][] array = new double[n][n];
        int count = 0;
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = Math.sin((i*i - j*j)/n);
                if(array[i][j] > 0) count++;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println(count);
    }
}
