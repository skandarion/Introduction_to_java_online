package com.company.epam.introduction_to_java_online.strings.first_part;

public class Task3 {
    public int countOfDigits(String str){
        int count = 0;
        char[] ch = str.toCharArray();
        for(int i = 0; i < ch.length; i ++){
            if(Character.isDigit(ch[i])){
                count++;
            }
        }
        return count;
    }
}
