package com.company.epam.introduction_to_java_online.tasks.task1.entity;

public class BookBuilder {
    String bookName;
    String author;
    String typeOfBook;

    public BookBuilder setBookName(String bookName) {
        this.bookName = bookName;
        return this;
    }

    public BookBuilder setAuthor(String author) {
        this.author = author;
        return this;
    }

    public BookBuilder setTypeOfBook(String typeOfBook) {
        this.typeOfBook = typeOfBook;
        return this;
    }
    public Book build(){
        return new Book(this);
    }
}
