package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task5 {
    public void getResult() {
        // создание, заполнение и вывод целочисленного массива в виде матрицы
        int n = 10;
        int[] array = new int[n];
        setArray(array);
        printArray(array);
        bubbleSort(array);
        secondMaxInSortedArray(array);
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
    public void bubbleSort (int[] array){
        boolean flag = false;
        while (flag == false){
            flag = true;
            for(int i = 0; i < array.length -1; i++){
                if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    flag = false;
                }
            }
        }
    }
    public void secondMaxInSortedArray (int[] array){
            for(int i = array.length-1; i > 0; i--) {
                if (array[i - 1] != array[i]) {
                    System.out.println("second max is " + array[i - 1]);
                    break;
            }
        }
    }

}
