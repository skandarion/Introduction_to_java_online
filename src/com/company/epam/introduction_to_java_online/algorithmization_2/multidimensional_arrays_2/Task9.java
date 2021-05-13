package com.company.epam.introduction_to_java_online.algorithmization_2.multidimensional_arrays_2;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

public class Task9 {
    public static void main(String[] args) {
        getResult();
    }
    public static void getResult() {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int n = 3, m = 10;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                array[i][j] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
        // создание доп массива с суммами значений всех столбцов
        int[] temp = new int[m];
        for (int i = 0; i < m; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++){
                sum = sum + array[j][i];
            }
            temp[i] = sum;
        }

        // поиск максимальной суммы
        int max = temp[0];
        for (int i = 0; i < m; i++){
            if(temp[i] > max) max =temp[i];
        }

        // сравнение и вывод
        for (int i = 0; i < m; i++){
            if(temp[i] == max){
                for(int j = 0; j < n; j++){
                    System.out.print(array[j][i] + "\n");
                }
                System.out.println("");
            }
        }
    }
}
