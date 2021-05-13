package com.company.epam.introduction_to_java_online.tasks.task1;

import com.company.epam.introduction_to_java_online.tasks.task1.entity.Book;
import com.company.epam.introduction_to_java_online.tasks.task1.entity.User;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;

public class UserUtil {
     public ArrayList<User> usersList = new ArrayList<User>();
    // загрузка базы юзеров из файла (десериализация json) при создании объекта UserUtil
    {
        Gson gson = new GsonBuilder().create();
        Type type = new TypeToken<ArrayList<User>>(){}.getType();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task1\\data\\users.txt"));
            usersList = gson.fromJson(br, type);
        } catch (FileNotFoundException e) {
            System.out.println("can't find file with the library");
        }
    }

    public void addUser (String name, String surname, String login, String pass, boolean isAdmin) throws NoSuchAlgorithmException {
        User user = new User(name, surname, login, pass, isAdmin);
        usersList.add(user);
        resetFile();
    }

    //перезаписать старый файл на основе обновленного списка userList
    public void resetFile (){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String str = gson.toJson(usersList);
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task1\\data\\users.txt");
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("cant find file of library");
        }
    }

    public void showUsers(){
        usersList.forEach(System.out::println);
    }
}
