package com.company.epam.introduction_to_java_online.classes.simple_classes.task9;

import java.util.ArrayList;

public class Bookshelf {
    ArrayList<Book> arrayOfBooks = new ArrayList<>();

    public void addBookToBookshelf (Book book){
        arrayOfBooks.add(book);
    }

    public void printBookOfAuthor(String author){
        for(Book book : arrayOfBooks){
            if(book.getAuthor().contains(author)){
                System.out.println(book.toString());
            }
        }
    }
    public void printBookOfPublisher(String publisher){
        for(Book book : arrayOfBooks){
            if(book.getPublisher().contains(publisher)){
                System.out.println(book.toString());
            }
        }
    }

    public void printBookAfterYear(int year){
        for(Book book : arrayOfBooks){
            if(book.getPublishingYear() > year){
                System.out.println(book.toString());
            }
        }
    }


}
