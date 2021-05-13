package com.company.epam.introduction_to_java_online.tasks_6.task3.server;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class SideUtils {
    public static void sendXml(ServerSocket serverSocket) throws IOException {
        Socket clientSocket = serverSocket.accept();

        File fileToSend = new File("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task3\\server\\data\\students.xml");
        InputStream inStream = new FileInputStream(fileToSend);
        BufferedInputStream binStream = new BufferedInputStream(inStream);
        byte[] bytes = new byte[(int)fileToSend.length()];

        binStream.read(bytes,0,bytes.length);

        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(clientSocket.getOutputStream()));
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
