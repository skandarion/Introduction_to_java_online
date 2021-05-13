package com.company.epam.introduction_to_java_online.tasks_6.task3.client;

import java.io.*;
import java.net.Socket;

public class Client {
    public static void mainMenu() throws IOException {
        while(true) {
            System.out.println("1. view student case\n" +
                    "2. edit student case\n" +
                    "3. create new case\n" +
                    "0. exit program");
            int choice = SideUtils.readInt();


            switch (choice) {
                case 1: {
                    viewCase();
                    System.out.println("enter to return to previous menu");
                    SideUtils.readString();
                    break;
                }
                case 2: {
                    editCase();
                    System.out.println("enter to return to previous menu");
                    SideUtils.readString();
                    break;
                }
                case 3: {
                    // не работатет. по аналогии с editCase
                    createCase();
                    System.out.println("enter to return to previous menu");
                    SideUtils.readString();
                    break;
                }
            }
            if(choice == 0){
                System.out.println("bye bye");
                break;
            }
        }
    }


    public static void logIn() throws IOException {

        Socket socket = new Socket("127.0.0.1", 9999);

        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        out.write("login");
        out.newLine();
        out.flush();

        System.out.println("Hello!\n");

        while(true) {
            System.out.println("enter your login: ");
            String login = com.company.epam.introduction_to_java_online.tasks_6.task3.client.SideUtils.readString();
            System.out.println("enter your password: ");
            String password = com.company.epam.introduction_to_java_online.tasks_6.task3.client.SideUtils.readString();

            out.write(login);
            out.newLine();
            out.flush();

            out.write(password);
            out.newLine();
            out.flush();

            String str = in.readLine();

            if (str.contains("hello")) {
                System.out.println(str);
                break;
            } else if (str.contains("sorry")) {
                System.out.println(str);
            }
        }
        out.close();
        in.close();
        socket.close();
    }

    public static void viewCase() throws IOException {
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        out.write("1");
        out.newLine();
        out.flush();

        System.out.println("enter student id to view the case");
        String studentId = SideUtils.readString();
        out.write(studentId);
        out.newLine();
        out.flush();

        String response = in.readLine();
        System.out.println(response + "\n");

        out.close();
        in.close();
        socket.close();

    }
    public static void editCase() throws IOException{
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        out.write("2");
        out.newLine();
        out.flush();

        String response = in.readLine();
        System.out.println(response);
        if(!response.contains("sorry")){
            // получаем файл xml, декодим в studensList и работаем с ним
            // енкодим в xml, xml на сервер, перезаписываем серверный xml
            receiveXmlFromServer(socket);
            workingWithStudentCases();
            sendXmlToServer(socket);
        }
        out.close();
        in.close();
        socket.close();
    }

    public static void createCase() throws IOException{
        Socket socket = null;
        try {
            socket = new Socket("127.0.0.1", 9999);
        } catch (IOException e) {
            e.printStackTrace();
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

        out.write("3");
        out.newLine();
        out.flush();

        String response = in.readLine();
        System.out.println(response);
    }

    private static void receiveXmlFromServer(Socket socket) throws IOException {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            System.out.println("Connecting...");
            File file = new File("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task3\\server\\data\\students.xml");
            File file2 = new File("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task3\\client\\data\\st.xml");

            // receive file
            byte [] mybytearray  = new byte [(int) file.length()];
            InputStream is = socket.getInputStream();
            fos = new FileOutputStream(file2);
            bos = new BufferedOutputStream(fos);
            int bytesRead = is.read(mybytearray, 0, (int) file.length());
            bos.write(mybytearray, 0, bytesRead);
            bos.close();
            socket.close();
            System.out.println("File received");
        }
        finally {
            if (fos != null) fos.close();
            if (bos != null) bos.close();
            if (socket != null) socket.close();
        }
    }
    private static void sendXmlToServer(Socket socket) throws IOException {
        File file = new File("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task3\\client\\data\\st.xml");
        byte [] byteArray  = new byte [(int)file.length()];
        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        bis.read(byteArray,0, byteArray.length);

        System.out.println(new String(byteArray));

        OutputStream os = socket.getOutputStream();
        os.write(byteArray,0, byteArray.length);
        os.flush();
        System.out.println("done");
        os.close();
    }

    public static void workingWithStudentCases (){
        // метод беред полученный с сервера xml файл
        // десереализует в arrayList. изменяет его. сереализует обратно в xml. перезаписывая его
        // писать не буду, т.к. ошибок быть не должно
    }
}