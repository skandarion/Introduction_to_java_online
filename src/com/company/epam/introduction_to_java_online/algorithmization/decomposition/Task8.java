package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task8 {
    public void getResult(){
        //
        int n = 6;
        int[] array = new int[n];
        setArray(array);
        printArray(array);
        System.out.println(sum(1,3,array));
        System.out.println(sum(3,5,array));
        System.out.println(sum(4,6,array));
    }

    public int sum (int k, int m, int[] array){ // n и m номер элементов в массиве
        int sum = 0;
        for(int i = k-1; i < m; i++){
            sum = sum + array[i];
        }
        return sum;
    }

    public void setArray (int array[]){
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20 - 10);
        }
    }
    public void printArray (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        } System.out.println("");
    }
}
