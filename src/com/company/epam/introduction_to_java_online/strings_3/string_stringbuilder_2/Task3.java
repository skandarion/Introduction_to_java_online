package com.company.epam.introduction_to_java_online.strings_3.string_stringbuilder_2;

//Проверить, является ли заданное слово палиндромом.

public class Task3 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("asdsa"));
    }

    public static boolean isPalindrome (String str){
        StringBuilder strResult = new StringBuilder(str);
        strResult.reverse();
        String strReverce = strResult.toString();
        return str.equalsIgnoreCase(strReverce);
    }
}
