package com.company.epam.introduction_to_java_online.strings_3.string_as_array_1;

//Удалить в строке все лишние пробелы, то есть серии подряд идущих пробелов заменить на одиночные пробелы.
// Крайние пробелы в строке удалить.

public class Task5 {
    public static void main(String[] args) {
        String str = getResult(" sadsa    sadas  as d   ");
        System.out.println(str);
    }
    public static String getResult(String str) {
        char[] ch = str.toCharArray();
        char[] ch2 = removeSpaces(ch);
        String result = new String(ch2);
        return result;
    }

    public static char[] removeSpaces(char[] charArray){
        char[] result = charArray;
        for(int i = 1; i <= result.length-1; i++){
            if(result[i] == ' ' && result[i] == result[i-1]){
                result = removeCharFromArray(result,i-1);
                i--;
            }
        }
        if(result[0] == ' ') {
            result = removeCharFromArray(result,0);
        }
        if(result[result.length-1] == ' ') {
            result = removeCharFromArray(result,result.length - 1);
        }
        return result;
    }
    public static char[] removeCharFromArray(char[] charArray, int removeIndex){
        char[] result = new char[charArray.length-1];
        for(int i = 0; i < removeIndex; i++){
            result[i] = charArray[i];
        }
        for(int i = removeIndex; i < charArray.length-1; i++){
            result[i] = charArray[i+1];
        }
        return result;
    }
}
