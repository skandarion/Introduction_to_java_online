package com.company.epam.introduction_to_java_online.tasks.task1;

import com.company.epam.introduction_to_java_online.tasks.task1.entity.Book;
import com.company.epam.introduction_to_java_online.tasks.task1.entity.BookBuilder;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.util.*;

public class Library {
    private static final String libraryName = "My Library";
    public static ArrayList<Book> booksList = new ArrayList<>();

    // загрузка объектов книг в библиотеку из файла (десериализация json)
    static {
        Gson gson = new GsonBuilder().create();
        Type type = new TypeToken<ArrayList<Book>>() {
        }.getType();
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task1\\data\\books.txt"));
            booksList = gson.fromJson(br, type);
        } catch (FileNotFoundException e) {
            System.out.println("can't find file with the library");
        }
    }

    public static void addBookToLibrary() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter book name");
        String name = sc.nextLine();
        System.out.println("enter author");
        String author = sc.nextLine();
        System.out.println("choose type of book: eBook or  paperBook");
        Book newBook;
        while (true) {
            String type = sc.nextLine();
            if (type.equalsIgnoreCase("eBook")) {
                newBook = new BookBuilder().setBookName(name).setAuthor(author).setTypeOfBook("eBook").build();
                break;
            } else if (type.equalsIgnoreCase("paperBook")) {
                newBook = new BookBuilder().setBookName(name).setAuthor(author).setTypeOfBook("paperBook").build();
                break;
            }
            System.out.println("your entered wrong type of book. try again(eBook or  paperBook)");
        }
        booksList.add(newBook);
        resetFile();
    }



    public static void showLibrary() {
        booksList.forEach(System.out::println);
    }

    // метод для перезаписи файла с книгами, после добавления новой книги
    public static void resetFile() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String str = gson.toJson(booksList);
        try {
            FileWriter fileWriter = new FileWriter("C:\\Users\\Asus\\IdeaProjects\\untitled1\\src\\com\\company\\epam\\introduction_to_java_online\\tasks\\task1\\data\\books.txt");
            fileWriter.write(str);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("cant find file of library");
        }
    }

    public static void searchBook(){
        System.out.println("enter book name");
        String str = SideUtils.readString();
        boolean bookShowed = false;
        for(Book b : booksList){
            if(b.getBookName().toLowerCase(Locale.ROOT).contains(str.toLowerCase(Locale.ROOT))){
                System.out.println(b.toString());
                bookShowed = true;
            }
        }
        if(!bookShowed){
            System.out.println("there is no such book in the library");
        }
    }
    public static void searchByAuthor(){
        System.out.println("enter author");
        String str = SideUtils.readString();
        boolean bookShowed = false;
        for(Book b : booksList){
            if(b.getAuthor().toLowerCase(Locale.ROOT).contains(str.toLowerCase(Locale.ROOT))){
                System.out.println(b.toString());
                bookShowed = true;
            }
        }
        if(!bookShowed){
            System.out.println("there is no author's books");
        }
    }
    public static void searchByFormat() {
        System.out.println("enter format you need (eBook or paperBook)");
        String temp;
        while (true) {
            String str = SideUtils.readString();
            if (str.equalsIgnoreCase("eBook")) {
                temp = "eBook";
                break;
            }
            else if (str.equalsIgnoreCase("paperBook")) {
                temp = "paperBook";
                break;
            }
            else {
                System.out.println("incorrect book type");
            }
        }
        for (Book b : booksList){
            if(b.getTypeOfBook().equalsIgnoreCase(temp)){
                System.out.println(b.toString());
            }
        }
    }

    public static void removeBook(){
        Iterator<Book> i = booksList.listIterator();

        System.out.println("enter book name");
        String str = SideUtils.readString();

        while (i.hasNext()) {
            Book book = i.next();
            if (book.getBookName().equalsIgnoreCase(str)) i.remove();
        }
        resetFile();
    }

    public static void removeBooksByAuthor(){
        Iterator<Book> i = booksList.listIterator();

        System.out.println("enter author");
        String str = SideUtils.readString();

        while (i.hasNext()) {
            Book book = i.next();
            if (book.getAuthor().equalsIgnoreCase(str)) i.remove();
        }
        resetFile();
    }
    public static void removeBooksByType(){
        Iterator<Book> i = booksList.listIterator();

        System.out.println("enter book type");
        String str = SideUtils.readString();

        while (i.hasNext()) {
            Book book = i.next();
            if (book.getTypeOfBook().equalsIgnoreCase(str)) i.remove();
        }
        resetFile();
    }

}


