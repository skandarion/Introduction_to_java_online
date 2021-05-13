package com.company.epam.introduction_to_java_online.algorithmization.one_dimensional_arrays;

public class Task4 {
    public void getResult(int n) {
        double[] array = new double[n];
        for (int i = 0; i < n; i++) {
            array[i] = Math.random() * 200 - 100;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        int nmin = 0, nmax = 0;
        double min = array[0]; double max = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
                nmax = i;
            }
            else if (array[i] < min){
                min = array[i];
                nmin = i;
            }
        }
        double temp = array[nmin];
        array[nmin] = array[nmax];
        array[nmax] = temp;
    }
    // работает при уникальности всех элементов массива
}
