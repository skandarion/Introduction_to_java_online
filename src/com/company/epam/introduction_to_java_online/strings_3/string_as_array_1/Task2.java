package com.company.epam.introduction_to_java_online.strings_3.string_as_array_1;

//Замените в строке все вхождения 'word' на 'letter'.

public class Task2 {
    public static void main(String[] args) {
        getResult();
    }
    public static void getResult() {
        String str = "i have the word and this word is word!";
        char[] ch = str.toCharArray();
        for (int i = 0; i <= ch.length - 4; i++) {
            if (ch[i] == 'w' && ch[i + 1] == 'o' && ch[i + 2] == 'r' && ch[i + 3] == 'd') {
                char[] ch3 = new char[ch.length + 2];
                for (int j = 0; j < i; j++) {
                    ch3[j] = ch[j];
                }
                for (int j = i, t = 0; j < i + 6; j++, t++) {
                    char[] ch4 = {'l', 'e', 't', 't', 'e', 'r'};
                    ch3[j] = ch4[t];
                }
                for (int j = i + 6; j < ch3.length; j++) {
                    ch3[j] = ch[j - 2];
                }
                ch = ch3;
            }
        }
        String result = new String(ch);
        System.out.println(result);
    }
}
