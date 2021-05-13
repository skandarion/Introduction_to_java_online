package com.company.epam.introduction_to_java_online.algorithmization_2.sorts_3;

//Сортировка Шелла

public class Task6 {
    public static void main(String[] args) {
        getResult();
    }

    public static void getResult() {
            // создание и заполнение исходного массива согласно условию
            int n = 10;
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = (int) (Math.random() * 10);
            }
            for (int i = 0; i < n; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println("");
/*        //сортировка согласно условию задачи, но больше похоже на вставки
        for(int i = 0; i < n -1;){
            if (array[i] > array[i+1]){
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
                if(i!=0){i--;}
            }
            else if(i !=  n -1) {i++;}
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
*/
        // сортировка шелла
        for (int step = n / 2; step > 0; step /= 2) {
            int i,j;
            for (i = step, j = 0; i < n; i++, j++){
                if(array[i] < array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }
}
