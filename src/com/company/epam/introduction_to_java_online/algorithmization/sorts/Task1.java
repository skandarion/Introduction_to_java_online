package com.company.epam.introduction_to_java_online.algorithmization.sorts;



public class Task1 {
    public void getResult(){
        // ввода в условии нет, поэтому соблюдаем условие (k-1)-m < a
        int k = 5; int m = 2;
        int a = 5; int b = 8;
        int[] array1 = new int[a];
        int[] array2 = new int[b];
        // заполение массивов
        for(int i = 0; i < a; i ++){
            array1[i] = (int) (Math.random() * 10);
        }
        for(int c = 0; c < a; c++){
            System.out.print(array1[c] + " ");
        } System.out.println("");
        for(int i = 0; i < b; i ++){
            array2[i] = (int) (Math.random() * 10);
        }
        for(int c = 0; c < b; c++){
            System.out.print(array2[c] + " ");
        }
        System.out.println("");
        // заполнение результирующего массива тремя циклами
        int[] array3 = new int[a+b];
        for (int i = 0; i < k-m; i ++){
          array3[i] = array1[i];
        }
        for(int c = 0; c < a + b; c++){
            System.out.print(array3[c] + " ");
        } System.out.println("");

        int i,j;
        for (i = k-m, j = 0; i < k-m+b; i ++, j++){
            array3[i] = array2[j];
        }
        for(int c = 0; c < a + b; c++){
            System.out.print(array3[c] + " ");
        } System.out.println("");

        int p,f;
        for (p = k-m+b, f = k-m; p < a+b; p ++, f++) {
            array3[p] = array1[f];
        }
        for(int c = 0; c < a + b; c++){
            System.out.print(array3[c] + " ");
        } System.out.println("");
    }
}
