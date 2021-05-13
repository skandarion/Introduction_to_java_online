package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task11 {
    public void compareTwoNumbers (int a, int b){
        if(countOfDigits(a) > countOfDigits(b)) {
            System.out.println("first number has more digits");
        }
        else if(countOfDigits(a) < countOfDigits(b)) {
            System.out.println("second number has more digits");
        }
        else { System.out.println("same number of digits"); }
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
