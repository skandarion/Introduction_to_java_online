package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task14 {
    public void getResult(int k){
        for(int i = 1; i <=k; i++){
            if(i == sumOfDigitsInPow(i)){
                System.out.println(i + " число Армстронга");
            }
        }
    }
    public int sumOfDigitsInPow(int a){
        int t = a;
        int sum = 0;
        while(t!=0){
            sum = sum + (int)Math.pow(t%10,countOfDigits(a));
            t = t/10;
        }
        return sum;
    }
    public int countOfDigits (int i) {
        int count = (i == 0) ? 1 : 0;
        while (i != 0) {
            i = i / 10;
            count++;
        }
        return count;
    }
}
