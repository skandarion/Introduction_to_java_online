package com.company.epam.introduction_to_java_online.algorithmization_2.sorts_3;

//Даны дроби. Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

public class Task8 {
    public static void main(String[] args) {
        getResult();
    }
    public static void getResult() {
        // создание и заполнение исходного массива согласно условию
        int n = 5;
        int[] array1 = new int[n];
        int[] array2 = new int[n];
        for (int i = 0; i < n; i++) {
            array1[i] = (int) ((Math.random() * 9)+1);
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            array2[i] = (int) ((Math.random() * 9+1));
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println("");
        // нахождение НОК array2 (знаменателей дроби)
        int nok = array2[0];
        for (int i = 0; i < n-1; i++){
            int nod = 1;
            int a = nok;
            int b = array2[i+1];
            boolean flag = true;
            int d = a; int e = b;
            while(flag){
                if(e==0){ nod = d; flag = false;}
                else { int c = d; d = e; e = c%e;}
            }
            nok = a*b/nod;
        }
        System.out.println("lcm " + nok);
        // приводим дроби к общему знаменателю
        int[] array3 = new int[n];
        int[] array4 = new int[n];
        for (int i = 0; i < n; i++){
            array3[i] = nok/array2[i]*array1[i];
        }
        for (int i = 0; i < n; i++){
            array4[i] = nok;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println("");
        // сортируем методом выбора
        for(int i = 0; i < n; i ++){
            int maxIndex = i;
            for(int j = i+1; j <n; j++){
                if(array3[j] < array3[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = array3[i];
            array3[i] = array3[maxIndex];
            array3[maxIndex] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(array3[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < n; i++) {
            System.out.print(array4[i] + " ");
        }
        System.out.println("");
    }
}
