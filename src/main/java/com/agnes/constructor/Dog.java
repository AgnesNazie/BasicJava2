package com.agnes.constructor;

public class Dog {
    /*Write a Java program to create a class called Dog with instance variables name and color.
     Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables.
    Print the values of the variables.
     */
    // create fields
    String name;
    String color;

    //  creates constructor


    public Dog(String name, String color) {
        this.name = name;
        this.color = color;
    }

    // create method to display info
    public void displayInfo() {
        System.out.println("Dog name " + name + ", Color " + color);

    }
}
