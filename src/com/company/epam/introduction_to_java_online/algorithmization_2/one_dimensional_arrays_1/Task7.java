package com.company.epam.introduction_to_java_online.algorithmization_2.one_dimensional_arrays_1;

//Даны действительные числа n a ,a , ,a 1 2  . Найти
//max( , , , ) 1 2 2 2 −1 +1 + + + n n n n a a a a  a a .

public class Task7 {
    public static void main(String[] args) {
        getResult(10);
    }

    public static void getResult(int n) {
        double[] array = new double[n];
        // заполнение массива рамдомными вещественными числами
        for (int i = 0; i < n; i++) {array[i] = (Math.random() * 200 - 100);}
        for (int i = 0; i < n; i++) {System.out.print(array[i] + "\t");}
        System.out.println("");

        double[] array2 = new double[n-1];
        for (int i = 0; i < array2.length; i++){
            array2[i] = array[i] + array[i+1];
        }
        double max = array2[0];
        for (int i = 0; i < array2.length; i++){
            if (array2[i] > max){
                max = array2[i];
            }
        }
        System.out.println(max);
    }
}
