package com.company.epam.introduction_to_java_online.algorithmization.decomposition;

public class Task2 {
    public int nod (int a, int b){
        if (b == 0){
            return a;
        }
        else {
            return nod(b, a%b);
        }
    }
    public int nod4 (int a, int b, int c, int d){
        return nod(nod(a,b),nod(c,d));
    }

}
