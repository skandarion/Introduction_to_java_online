package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task17 {
    public int countSubtraction(int a){
        int count = 0;
        int temp = a;
        while(temp != 0){
            temp = temp - sumOfDigits(a);
            count++;
        }
        return count;
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
}
