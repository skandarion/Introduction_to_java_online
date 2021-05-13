package com.company.epam.introduction_to_java_online.strings_3.string_as_array_1;

//В строке найти количество цифр.

public class Task3 {
    public static void main(String[] args) {
        int i = countOfDigits("String2das 235ew dsfsd");
        System.out.println(i);
    }
    public static int countOfDigits(String str){
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
