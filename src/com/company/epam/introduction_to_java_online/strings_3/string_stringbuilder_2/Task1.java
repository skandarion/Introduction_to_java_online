package com.company.epam.introduction_to_java_online.strings_3.string_stringbuilder_2;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class Task1 {
    public static void main(String[] args) {
        System.out.println(getResult("sad    sad asd  sa sd"));
    }

    public static int getResult(String str){
        int count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == ' '){
                int tempCount = 1;
                for(int j = i; j < str.length()-1; j++){
                    if(str.charAt(j) == str.charAt(j+1)){
                        tempCount++;
                    }
                    else break;
                }
                if(tempCount >= count){
                    count = tempCount;
                }
            }
        }
        return count;
    }
}
