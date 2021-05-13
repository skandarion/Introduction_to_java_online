package com.company.epam.introduction_to_java_online.tasks_6.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SideUtils {
    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static String readString() {
        try {
            String str = bufferedReader.readLine();
            return str;
        } catch (IOException e) {
            System.out.println("An error while trying to enter text. Try again.");
            return readString();
        }
    }

    public static int readInt() {
        try {
            int i = Integer.parseInt(readString());
            return i;
        } catch (NumberFormatException e) {
            System.out.println("An error while trying to enter a number. Try again.");
            return readInt();
        }
    }
}
