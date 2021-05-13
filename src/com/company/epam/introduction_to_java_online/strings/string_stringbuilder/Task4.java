package com.company.epam.introduction_to_java_online.strings.string_stringbuilder;

public class Task4 {
    public String getTort(){
        String str = "информатика";
        String result = str.substring(7,8).concat(str.substring(3,5)).concat(str.substring(7,8));
        return result;
    }
}
