package com.company.epam.introduction_to_java_online.strings_3.string_as_array_1;

//В строке найти количество чисел.

public class Task4 {
    public static void main(String[] args) {
        int i = countOfNumbers("dasdas 1241 s dasd21 1 3 ");
        System.out.println(i);
    }
    public static int countOfNumbers(String str) {
        int count = 0;
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length-1; i++) {
            if (Character.isDigit(ch[i]) && !Character.isDigit(ch[i+1])) {
                count++;
            }
        }
        if(Character.isDigit(ch[ch.length-1])){
            count++;
        }
        return count;
    }
}
