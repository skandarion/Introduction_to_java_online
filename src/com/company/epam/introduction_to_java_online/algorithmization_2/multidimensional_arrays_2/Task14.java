package com.company.epam.introduction_to_java_online.algorithmization_2.multidimensional_arrays_2;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

public class Task14 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        // условие таково, что матрица равносторонняя
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        // создаие матрицы с нужным количеством единиц в столбцах
        int n = 5, m = 5;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                if(i <= j) {
                    array[i][j] = 1;
                }
            else array[i][j] = 0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        // перемешивание значений в столбцах

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++) {
                int t1 = (int) (Math.random() * 5);
                int t2 = (int) (Math.random() * 5);
                int temp = array[t1][i];
                array[t1][i] = array[t2][i];
                array[t2][i] = temp;
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
