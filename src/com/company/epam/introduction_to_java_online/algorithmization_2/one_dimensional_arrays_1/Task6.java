package com.company.epam.introduction_to_java_online.algorithmization_2.one_dimensional_arrays_1;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class Task6 {
    public static void main(String[] args) {
        getResult(10);
    }
    public static void getResult(int n) {
        double[] array = new double[n];
        // заполнение массива рамдомными вещественными числами
        for (int i = 0; i < n; i++) {array[i] = (Math.random() * 200 - 100);}
        for (int i = 0; i < n; i++) {System.out.print(array[i] + "\t");}
        System.out.println("");
        double sum = 0;
        for (int i = 0; i < array.length; i++){
            if(isPrime(i)){
                sum = sum + array[i];
            }
        }
        System.out.println(sum);
    }

    public static boolean isPrime (int i){// проверка на простоту числа
        boolean check  = true;
        if (i == 0 || i == 1) check = false;
        for (int j = 2; j < i; j++){
            if( i % j == 0 ) {
                check = false;
                break;
            }
        }
        return check;
    }
}
