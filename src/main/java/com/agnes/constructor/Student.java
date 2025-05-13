package com.agnes.constructor;

public class Student {
    /*. Chaining Constructors
Write a Java program to create a class called Student with instance variables studentId, studentName, and grade.
Implement a default constructor and a parameterized constructor that takes all three instance variables.
 Use constructor chaining to initialize the variables.
Print the values of the variables.
     */
    int studentId;
    String studentName;
    char grade;

    //create default constructor
    public Student() {
        this(0, "UNKNOWN", '_');

    }

    //create parameterized constructor
    public Student(int studentId, String studentName, char grade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.grade = grade;
    }
    // method to display info
    public void displayInfo(){
        System.out.println("StudentID: " + studentId + ", Student Name: " + studentName + ", Grade :" + grade);
    }
}
