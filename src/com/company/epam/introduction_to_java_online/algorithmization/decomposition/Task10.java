package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task10 {
    public void getResult(){
        int i = 2314;
        int[] array = createArray(i);
        printArray(array);
    }

    public int[] createArray (int i){ // передается натуральное число N из условия
        int n = countOfNumbers(i);
        int[] array = new int[n];
        for (int j = n-1; j >= 0; j--){
            array[j] = i%10;
            i = i/10;
        }
        return array;
    }

    public int countOfNumbers (int i){
        int count = (i == 0) ? 1 : 0;
        while(i != 0){
            i = i/10;
            count++;
        }
        return count;
    }

    public void printArray (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        } System.out.println("");
    }
}
