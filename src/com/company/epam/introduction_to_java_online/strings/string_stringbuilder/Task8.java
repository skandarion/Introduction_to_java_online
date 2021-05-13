package com.company.epam.introduction_to_java_online.strings.string_stringbuilder;

import java.util.Scanner;

public class Task8 {
    public void getResult(){
        System.out.println(findLongestWord(enterString()));
    }

    public String findLongestWord(String str){
        int count = 0;
        int index = 0;
        int tempcount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) != ' '){
                tempcount++;
            }
            else {
                if(tempcount > count){
                    count = tempcount;
                    index = i;
                }
                tempcount = 0;
            }
        }
        String result = str.substring(index-count,index);
        return result;
    }

    public String enterString(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        return str;
    }
}
