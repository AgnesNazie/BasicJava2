package com.agnes.constructor;

public class Rectangle {
    /* Write a Java program to create a class called Rectangle with instance variables length and width.
    Implement a parameterized constructor and a copy constructor that initializes a new object using the values of an existing object.
    Print the values of the variables.
     */
    int length;
    int width;

    // create constructor
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Copy constructor
    public Rectangle(Rectangle other) {
        this.length = other.length;
        this.width = other.width;
    }

    //method to display info
    public void displayInfo() {
        System.out.println("Rectangle Length: " + length + ", Rectangle width: " + width);
    }

}
