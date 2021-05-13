package com.company.epam.introduction_to_java_online.algorithmization_2.multidimensional_arrays_2;

//В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int n = 4, m = 4;
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
        // ввод двух столбцов с проверкой по размеру массива
        Scanner sc = new Scanner(System.in);
        int p = 0;
        boolean flag = true;
        while (flag){
            System.out.println("Enter the number of first column");
            p = sc.nextInt();
            if (p > 0 && p <= n){
                flag = false;
                System.out.println("first column is " + p);
            }
            else {
                System.out.println("not enough columns, try again");
            }
        }
        int k = 0;
        boolean flag2 = true;
        while (flag2){
            System.out.println("Enter the number of the second column");
            k = sc.nextInt();
            if (k > 0 && k <= n){
                flag2 = false;
                System.out.println("the second column is " + k);
            }
            else {
                System.out.println("not enough columns, try again");
            }
        }
        sc.close();
        // замена
        for(int i = 0; i < m; i ++){
            int temp = array[i][p-1];
            array[i][p-1] = array[i][k-1];
            array[i][k-1] = temp;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }
}
