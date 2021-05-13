package com.company.epam.introduction_to_java_online.strings_3.string_stringbuilder_2;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class Task4 {
    public static void main(String[] args) {
        System.out.println(getTort());
    }

    public static String getTort(){
        String str = "информатика";
        String result = str.substring(7,8).concat(str.substring(3,5)).concat(str.substring(7,8));
        return result;
    }
}
