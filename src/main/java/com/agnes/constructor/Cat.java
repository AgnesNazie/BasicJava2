package com.agnes.constructor;

public class Cat {
    /*1. Default Constructor:
Write a Java program to create a class called "Cat" with instance variables name and age.
Implement a default constructor that initializes the name to "Unknown" and the age to 0.
Print the values of the variables.

         */
    //creates fields
    String name;
    int age;
    //creates constructor


    public Cat() {
        this.name = "UNKNOWN";
        this.age = 0;
    }
    public void displayInfo(){
        System.out.println("Cat's name: " + name);
        System.out.println("Cat's age: " + age);
    }
}
