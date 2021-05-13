package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task13 {
    public void getResult(int n){
        for(int i = n; i <= 2*n; i++){
            if(isPrime(i) && isPrime(i+2)){
                System.out.println(i + " " + (i+2) + " - числа близнецы");
            }
        }
    }
    public boolean isPrime(int i) {            // проверка на простоту числа
        boolean check = true;
        if (i == 0 || i == 1) check = false;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                check = false;
                break;
            }
        }
        return check;
    }
}
