package com.Class;

public class Student {
    //create fields
    int id;
    String name;
    String course;

    //constructor
    public Student(int id, String name, String course) {
        setId(id);
        setName(name);
        setCourse(course);
    }

    //getter for id
    public int getId() {
        return id;
    }

    //setter for id
    public void setId(int id) {
        if (id < 0)
            throw new IllegalArgumentException("ID cannot be null or negative");
        this.id = id;
    }

    //getter for name
    public String getName() {
        return name;
    }

    //setter for name
    public void setName(String name) {
        if (name == null || name.trim().isEmpty())
            throw new IllegalArgumentException("Name cannot be null or empty");
        this.name = name;
    }

    //getter for course
    public String getCourse() {
        return course;
    }

    //setter for course
    public void setCourse(String course) {
        if (course == null || course.trim().isEmpty())
            throw new IllegalArgumentException("course cannot be null or empty");
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course='" + course + '\'' +
                '}';
    }
}
