package com.agnes.constructor;

public class ConstructorExercises {
    public static void main(String[] args) {
        exe5();
    }

    public static void exe1() {
        Cat myCat = new Cat();
        myCat.displayInfo();
    }

    public static void exe2() {
        Dog myDog = new Dog("Bingo", "black");
        myDog.displayInfo();
    }

    public static void exe3() {
        Book myBook = new Book();
        Book myBook1 = new Book("Java", "Agnes");
        Book myBook2 = new Book("Code", "Che", 300);

        myBook.displayInfo();
        myBook1.displayInfo();
        myBook2.displayInfo();
    }

    public static void exe4() {
        Student myStudent = new Student();
        Student myStudent1 = new Student(1, "Agnes", 'A');

        myStudent.displayInfo();
        myStudent1.displayInfo();

    }

    public static void exe5() {
        Rectangle myRectangle = new Rectangle(80, 60);
        Rectangle myRectangle1 = new Rectangle(myRectangle);

        myRectangle.displayInfo();
        myRectangle1.displayInfo();
    }
}
