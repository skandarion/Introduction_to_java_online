package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task1 {
    public int nod (int a, int b){
        if (b == 0){
            return a;
        }
        else {
            return nod(b,a%b);
        }
    }
    public int nok (int a, int b){
        return a*b/nod(a,b);
    }
}
