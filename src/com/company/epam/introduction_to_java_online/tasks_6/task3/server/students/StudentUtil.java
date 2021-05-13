package com.company.epam.introduction_to_java_online.tasks_6.task3.server.students;

import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class StudentUtil {
    public ArrayList<Student> studentArrayList = new ArrayList<>();

    {
        try{
            XMLDecoder decoder = new XMLDecoder(
                    new BufferedInputStream(
                            new FileInputStream("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task3\\server\\data\\students.xml")));
            studentArrayList = (ArrayList<Student>)decoder.readObject();
            decoder.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}
