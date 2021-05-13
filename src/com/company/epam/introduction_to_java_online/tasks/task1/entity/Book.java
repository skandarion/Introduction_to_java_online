package com.company.epam.introduction_to_java_online.tasks.task1.entity;

import java.io.Serializable;

public class Book implements Serializable {
    private final String bookName;
    private final String author;
    private final String typeOfBook;

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public String getTypeOfBook() {
        return typeOfBook;
    }

    public Book(BookBuilder bookBuilder) {
        this.bookName = bookBuilder.bookName;
        this.author = bookBuilder.author;
        this.typeOfBook = bookBuilder.typeOfBook;
    }

    @Override
    public String toString() {
        return "bookName: " + bookName + ", author: " + author + ", type: " + typeOfBook;
    }
}
