package com.company.epam.introduction_to_java_online.strings_3.string_stringbuilder_2;

//В строке вставить после каждого символа 'a' символ 'b'.

public class Task2 {
    public static void main(String[] args) {
        System.out.println(getResult("asda d ad asd asd a"));
    }

    public static String getResult(String str){
        return str.replace('a','b');
    }
}
