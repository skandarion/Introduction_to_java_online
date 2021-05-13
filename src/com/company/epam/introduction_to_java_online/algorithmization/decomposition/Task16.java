package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task16 {
    public void getResult(int a){
        System.out.println(sum(a));
        System.out.println(countOfEvenDigits(sum(a)));
    }

    public int sum (int n){
        int sum = 0;
        for(int i = firstNDigitNumber(n); i <= lastNDigitNumber(n); i ++){
            if(isOnlyOdd(i)){
                sum = sum + i;
            }
        }
        return sum;
    }

    public boolean isOnlyOdd (int i){
        boolean result = true;
        int temp = i;
        while (temp != 0){
            int a = temp%10;
            temp = temp/10;
            if(a%2 == 0){
                result = false;
                break;
            }
        }
        return result;
    }
    public int firstNDigitNumber(int n){
        int result = 1;
        for(int i = 1; i < n; i++){
            result = result*10;
        }
        return result;
    }
    public int lastNDigitNumber(int n){
        int result = 1;
        for(int i = 0; i < n; i++){
            result = result*10;
        }
        return result - 1;
    }
    public int countOfEvenDigits (int i){
        int count = 0;
        int temp = i;
        while(temp != 0){
            if(temp%2 == 0){
                count++;
            }
            temp = temp/10;
        }
        return count;
    }
}
