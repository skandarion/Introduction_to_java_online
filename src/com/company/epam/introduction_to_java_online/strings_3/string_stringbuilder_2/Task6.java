package com.company.epam.introduction_to_java_online.strings_3.string_stringbuilder_2;

//Из заданной строки получить новую, повторив каждый символ дважды.

public class Task6 {
    public static void main(String[] args) {
        System.out.println(getResult("sal daskln d"));
    }

    public static String getResult(String str){
        StringBuilder str2 = new StringBuilder(str);
        for(int i = 0; i < str2.length(); i += 2){
            str2.insert(i,str2.charAt(i));
        }
        return str2.toString();
    }
}
