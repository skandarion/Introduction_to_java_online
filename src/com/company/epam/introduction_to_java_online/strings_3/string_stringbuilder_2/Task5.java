package com.company.epam.introduction_to_java_online.strings_3.string_stringbuilder_2;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class Task5 {
    public static void main(String[] args) {
        System.out.println(getResult("asdsadsafsafsadasda"));
    }

    public static int getResult(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'a'){
                count++;
            }
        }
        return count;
    }
}
