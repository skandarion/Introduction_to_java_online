package com.company.epam.introduction_to_java_online.algorithmization.one_dimensional_arrays;

public class Task1 {
    public void getResult (int k){
       int[] arr = {2,3,4,8,64,13,20};
       int sum = 0;
       for (int i =0; i < arr.length; i++){
           if(arr[i] % 2 == 0){
               sum = sum + arr[i];
           }
       }
        System.out.println(sum);
    }
}
