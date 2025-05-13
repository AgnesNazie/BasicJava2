package com.agnes.constructor;

public class Book {
    /*Write a Java program to create a class called "Book" with instance variables title, author, and price.
     Implement a default constructor and two parameterized constructors:
     One constructor takes title and author as parameters.
     The other constructor takes title, author, and price as parameters.
     Print the values of the variables for each constructor.
     */
    //create fields or variables
    String title;
    String author;
    double price;

    //create constructor


    public Book() {
        this.title = "UNKNOWN";
        this.author = "UNKNOWN";
        this.price = 0.0;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + " ,Author: " + author + " ,Price: " + price);
    }
}
