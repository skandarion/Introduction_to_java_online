package com.company.epam.introduction_to_java_online.strings.string_stringbuilder;

public class Task1 {
    public int getResult(String str){
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
