package com.company.epam.introduction_to_java_online.strings.first_part;

public class Task5 {
    public String getResult(String str) {
        char[] ch = str.toCharArray();
        char[] ch2 = removeSpaces(ch);
        String result = new String(ch2);
        return result;
    }

    public char[] removeSpaces(char[] charArray){
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
    public char[] removeCharFromArray(char[] charArray, int removeIndex){
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
