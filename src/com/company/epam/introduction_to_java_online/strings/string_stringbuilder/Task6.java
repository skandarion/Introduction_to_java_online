package com.company.epam.introduction_to_java_online.strings.string_stringbuilder;

public class Task6 {
    public String getResult(String str){
        StringBuilder str2 = new StringBuilder(str);
        for(int i = 0; i < str2.length(); i += 2){
            str2.insert(i,str2.charAt(i));
        }
        return str2.toString();
    }
}
