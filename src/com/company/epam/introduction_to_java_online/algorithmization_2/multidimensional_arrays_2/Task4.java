package com.company.epam.introduction_to_java_online.algorithmization_2.multidimensional_arrays_2;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

public class Task4 {
    public static void main(String[] args) {
        getResult(10);
    }

    public static void getResult(int n) {
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
