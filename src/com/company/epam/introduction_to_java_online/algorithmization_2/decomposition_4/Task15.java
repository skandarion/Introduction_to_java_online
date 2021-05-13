package com.company.epam.introduction_to_java_online.algorithmization_2.decomposition_4;

//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
// (например, 1234, 5789). Для решения задачи использовать декомпозицию.

public class Task15 {
    public static void main(String[] args) {
        //3-х значные числа
        getResult(100,1000);
    }
    public static void getResult(int a, int b){ // a и b задают зону поиска чиселж
        for(int i = a; i < b; i++){
            if(isIncreasing(arrayFromNumber(i))){
                System.out.println(i + " - цифры строго возрастают");
            }
        }
    }
    public static boolean isIncreasing (int[] array){ // true если цифры числа строго возрастают
        boolean result = true;
        for(int i = 0; i < array.length - 1; i ++){
            if(array[i] < array[i+1]){
                result = true;
            }
            else {result = false;
            break;}
        }
        return result;
    }
    public static int[] arrayFromNumber (int a){ // число поцифренно в массив, чтобы проверить строгий рост
        int t = a;
        int d = countOfDigits(a);
        int[] array = new int[countOfDigits(a)];
        for(int i = d-1; i >= 0; i--){
            array[i] = t%10;
            t = t/10;
        }
        return array;
    }
    public static int countOfDigits (int i) {
        int count = (i == 0) ? 1 : 0;
        while (i != 0) {
            i = i / 10;
            count++;
        }
        return count;
    }
    public static void printArray (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        } System.out.println("");
    }

}
