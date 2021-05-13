package com.company.epam.introduction_to_java_online.algorithmization_2.one_dimensional_arrays_1;

//В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

public class Task1 {
    public static void main(String[] args) {
        getResult(3);
    }

    public static void getResult (int k){
       int[] arr = {2,3,4,8,64,13,20};
       int sum = 0;
       for (int i =0; i < arr.length; i++){
           if(arr[i] % k == 0){
               sum = sum + arr[i];
           }
       }
        System.out.println(sum);
    }
}
