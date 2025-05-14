package com.Class;

public class Pet {
    //field
    int id;
    String name;
    String type;

    //Constructor
    public Pet(int id, String name, String type) {
        setId(id);
        setName(name);
        setType(type);
    }
    // getter for id

    public int getId() {
        return id;
    }
    //setter for id

    public void setId(int id) {
        if (id < 0)
            throw new IllegalArgumentException("Id cannot be null or negative");
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

    // getter for type
    public String getType() {
        return type;
    }

    //setter for type
    public void setType(String type) {
        if (type == null || type.trim().isEmpty())
            throw new IllegalArgumentException("Type cannot be null or empty");
        this.type = type;
    }

    //method to display info
    public void displayInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Type: " + type);
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
