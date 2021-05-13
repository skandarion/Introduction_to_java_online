package com.company.epam.introduction_to_java_online.algorithmization.multidimensional_arrays;

public class Task11 {
    public void getResult() {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int n = 10, m = 20;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                array[i][j] = (int) (Math.random() * 16);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");

        for(int i = 0; i < n; i++){
            int count = 0;
            for (int j = 0; j < m; j++){
                if(array[i][j] == 5){
                    count++;
                }
            }
            if (count >= 3){
                for(int k = 0; k < m; k++){
                    System.out.print(array[i][k] + " ");
                }
                System.out.println("");
            }
        }
    }
}
