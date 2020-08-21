package com.example.gitpractice;

public class Book {
    private String bookname;
    private String authorname;
    private String booktype;

    public Book(String bookname, String authorname, String booktype) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.booktype = booktype;
    }

    public String getBookname() {
        return bookname;
    }

    public String getAuthorname() {
        return authorname;
    }

    public String getBooktype() {
        return booktype;
    }
}
