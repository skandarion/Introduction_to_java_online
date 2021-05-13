package com.company.epam.introduction_to_java_online.algorithmization_2.multidimensional_arrays_2;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class Task1 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult(){
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int n = 10, m = 10;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i ++) {
            for (int j = 0; j < m; j++)
                array[i][j] = (int)(Math.random()*20 - 10);
        }
        for (int i = 0; i < n; i ++){
            for(int j = 0; j < m ; j++) {
                System.out.print(array[i][j] + "\t");
            } System.out.println("");
        }
        System.out.println("\n");

        for (int i = 1; i < m; i = i + 2) {
            if (array[0][i] > array[n - 1][i]) {
                for (int j = 0; j < n; j++) {
                    System.out.print(array[j][i] + "\n");
                }
                System.out.println("");
            }
            System.out.println("\n");
        }
    }
}
