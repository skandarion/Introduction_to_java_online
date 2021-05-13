package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//На плоскости заданы своими координатами n точек. Написать метод(методы),
// определяющие, между какими из пар точек самое большое расстояние. Указание.
// Координаты точек занести в массив.

public class Task4 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int n = 5;int m = 2;
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                array[i][j] = (int) (Math.random() * 20 - 10);
        }
        printDoubleArray(array);
        // перебор всех пар точек с нахождением индексов при максимальном расстоянии
        int index1 = 0; int index2 = 0;
        for (int i = 0; i < n -1; i++){
            for(int j = 0; j < n-1; j ++){
                if (getDistance(array[i], array[j]) > getDistance(array[i], array[j+1])){
                    index1 = i;
                    index2 = j;
                }
            }
        }
        System.out.println("max distance between " + array[index1][0] +";"+ array[index1][1] +
                            " and " + array[index2][0] + ";" + array[index2][1]) ;
    }

    public static void printDoubleArray (int array[][]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static double getDistance (int[] array1, int[] array2){
        return Math.sqrt((array2[0] - array1[0])*(array2[0] - array1[0]) + (array2[1] - array1[1])*(array2[1] - array1[1]));
    }
}
