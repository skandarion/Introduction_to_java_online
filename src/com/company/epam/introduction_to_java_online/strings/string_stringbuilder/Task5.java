package com.company.epam.introduction_to_java_online.strings.string_stringbuilder;

public class Task5 {
    public int getResult(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
}
