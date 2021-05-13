package com.company.epam.introduction_to_java_online.algorithmization.one_dimensional_arrays;

public class Task2 {
    public void getResult(int n, double z) {
        double[] array = new double[n];
        for (int i = 0; i < n; i ++){
            array[i] = Math.random()*100;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        int count = 0;
        for (int i = 0; i < n; i ++){
            if(array[i] > z){
                array[i] = z;
                count++;
            }
        }

        for (int i = 0; i < n; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println("\nreplace count " + count);

    }
}

