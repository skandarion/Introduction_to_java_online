package com.company.epam.introduction_to_java_online.tasks_6.task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


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
    public static String toHashMD5 (String pass) {
        MessageDigest messageDigest = null;
        try {
            messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(pass.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = messageDigest.digest();
            StringBuilder builder = new StringBuilder();
            for(byte b : bytes){
                builder.append(String.format("%02X", b));
            }
            return builder.toString();

        } catch (NoSuchAlgorithmException e) {
            System.out.println("there is no such hash format");
        }
        return null;
    }
}
