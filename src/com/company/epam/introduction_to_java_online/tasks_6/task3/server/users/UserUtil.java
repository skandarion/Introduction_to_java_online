package com.company.epam.introduction_to_java_online.tasks_6.task3.server.users;

import java.beans.XMLDecoder;
import java.io.*;
import java.util.ArrayList;

public class UserUtil{
        public ArrayList<User> users = new ArrayList<>();
    {
        XMLDecoder decoder = null;
        try {
            decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task3\\server\\data\\users.xml")));
            users = (ArrayList<User>) decoder.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        }
    }
}
