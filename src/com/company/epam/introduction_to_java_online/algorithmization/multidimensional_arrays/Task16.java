package com.company.epam.introduction_to_java_online.algorithmization.multidimensional_arrays;

public class Task16 {
    public void getResult() {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int n = 3, m = 3;
        int[][] array = new int[n][m];
        boolean flag = true;
        while (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++)
                    array[i][j] = (int) (Math.random() * 11);
            }
            // сумма диагоналей
            int sumd1 = 0;
            for (int i = 0; i < n; i++){
                    sumd1 = sumd1 + array[i][i];
                }

            int sumd2 = 0;
            int temp = n-1;
                for (int i = 0; i < n; i ++){
                    sumd2 = sumd2 + array[temp][i];
                    temp--;
                }

            // сумма строк
            int[] array1 = new int[n];
            for (int i = 0; i < n; i++) {
                int tempsum = 0;
                for (int j = 0; j < m; j++) {
                    tempsum = tempsum + array[i][j];
                }
                array1[i] = tempsum;
            }

            //сумма столбцов
            int[] array2 = new int[n];
            for(int i = 0; i < n; i++){
                int tempsum = 0;
                for (int j = 0; j < m; j++){
                    tempsum = tempsum + array[j][i];
                }
                array2[i] = tempsum;
            }
            // проверка условий магического квадрата
            boolean flag2 = true;
            for (int i = 0; i < 2; i++){
                if(array1[i] != array2[i] || array1[i] != array1[i+1] || array2[i] != array2[i+1]){
                    flag2 = false;
                    break;
                }
            }

            if (sumd1 == sumd2 && flag2 == true && sumd1 == array1[0]){
                flag = false;
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
