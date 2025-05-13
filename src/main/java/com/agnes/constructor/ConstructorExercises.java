package com.agnes.constructor;

public class ConstructorExercises {
    public static void main(String[] args) {
exe2();
    }

    public static void exe1() {
        Cat myCat = new Cat();
        myCat.displayInfo();
    }
    public  static void exe2() {
        Dog myDog = new Dog("Bingo", "black");
        myDog.displayInfo();

    }
}
