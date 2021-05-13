package com.company.epam.introduction_to_java_online.strings.string_stringbuilder;

public class Task3 {
    public boolean isPalindrome (String str){
        StringBuilder strResult = new StringBuilder(str);
        strResult.reverse();
        String strReverce = strResult.toString();
        return str.equalsIgnoreCase(strReverce);
    }
}
