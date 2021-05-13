package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task12 {
    public void createArray (int k, int n){ // натуральные числа k > n
        int[] array = new int[findLengthOfArray(k,n)];
        for(int i = k+1, j = 0; i < n; i++) {
            if (sumOfDigits(i) == k) {
                array[j] = i;
                j++;
            }
        }
        printArray(array);
    }
    public int sumOfDigits (int a){
        int sum = 0;
        int t = a;
        while(t!=0){
            sum = sum + t%10;
            t = t/10;
        }
        return sum;
    }
    public int findLengthOfArray (int k, int n){ //
        int count = 0;
        for(int i = 0; i < n; i++){
            if(i == k) {}
            else if(sumOfDigits(i) == k){
                count++;
            }
        }
        return count;
    }
    public void printArray (int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        } System.out.println("");
    }
}
