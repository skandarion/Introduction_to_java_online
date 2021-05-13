package com.company.epam.introduction_to_java_online.tasks.task3.server;

import com.company.epam.introduction_to_java_online.tasks.task3.server.students.Student;
import com.company.epam.introduction_to_java_online.tasks.task3.server.students.StudentUtil;
import com.company.epam.introduction_to_java_online.tasks.task3.server.users.User;
import com.company.epam.introduction_to_java_online.tasks.task3.server.users.UserUtil;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void start() throws IOException {
        UserUtil users = new UserUtil();
        StudentUtil students = new StudentUtil();
        boolean isAdmin = false;

        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("server is running");


        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("client accepted");
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String request = in.readLine();
            // логинимся
            if (request.equals("login")) {

                boolean isLogin = false;
                while (!isLogin) {
                    System.out.println("try to login");
                    String login = in.readLine();
                    System.out.println(login);
                    String password = in.readLine();
                    System.out.println(password);

                    for (User u : users.users) {
                        if (login.equals(u.getLogin()) && SideUtils.toHashMD5(password).equals(u.getPass())) {
                            if (u.isAdmin()) {
                                System.out.println("hello " + u.getFirstName());
                                out.write("hello " + u.getFirstName());
                                out.newLine();
                                out.flush();
                                isLogin = true;
                                isAdmin = true;
                                break;
                            } else {
                                System.out.println("hello " + u.getFirstName());
                                out.write("hello " + u.getFirstName());
                                out.newLine();
                                out.flush();
                                isLogin = true;
                                isAdmin = false;
                                break;
                            }
                        }
                    }
                    System.out.println("login check");
                    if (isLogin) {
                        break;
                    }
                    System.out.println("sorry try to login again");
                    out.write("sorry try to login again");
                    out.newLine();
                    out.flush();
                }
                System.out.println("loop closed");
            }
            // view student case
            else if (request.equals("1")) {
                String studentId = in.readLine();
                int studentIdInt = Integer.parseInt(studentId);
                for (Student s : students.studentArrayList) {
                    if (studentIdInt == s.getId()) {
                        out.write(s.toString());
                        out.newLine();
                        out.flush();
                    }
                }

            }
            // edit student case
            else if (request.equals("2")) {
                if (isAdmin == false) {
                    out.write("sorry, you don't have enough rights");
                    out.newLine();
                    out.flush();
                }
                else {
                    out.write("start working with student cases");
                    out.newLine();
                    out.flush();
                    sendXmlToClient(socket);
                    receiveXmlFromClient(socket);
                }
            }

            // create student case
            else if (request.equals("3")) {
                if (isAdmin == false) {
                    out.write("sorry, you don't have enough rights");
                    out.newLine();
                    out.flush();
                }
                else {

                }

            }
            // exit and close server
            else if (request.equals("0")) {
                System.out.println("bye bye");
                break;
            }
            System.out.println("others conditions checked");
            in.close();
            out.close();
            socket.close();
            System.out.println("end of socket");
        }
    }
    private static void sendXmlToClient(Socket socket) throws IOException {
        File file = new File("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task3\\server\\data\\students.xml");
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
    private static void receiveXmlFromClient(Socket socket) throws IOException {
        FileOutputStream fos = null;
        BufferedOutputStream bos = null;
        try {
            System.out.println("Connecting...");
            File file2 = new File("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task3\\server\\data\\students.xml");
            File file = new File("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task3\\client\\data\\st.xml");

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
}

