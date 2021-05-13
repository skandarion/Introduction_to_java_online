package com.company.epam.introduction_to_java_online.strings.first_part;

public class Task4 {
    public int countOfNumbers(String str) {
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            if (Character.isDigit(ch[i]) && !Character.isDigit(ch[i+1])) {
                count++;
            }
        }
        if(Character.isDigit(ch[ch.length-1])){
            count++;
        }
        return count;
    }
}
