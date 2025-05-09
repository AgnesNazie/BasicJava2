package com.agnes.Binary;

import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        exe18();


    }

    public static void exe17() {

     /*17. Binary Addition

Write a Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output

Sum of two binary numbers: 101
*/
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a Binary  Number");
        String binary1 = scanner.next();

        System.out.println("Enter the second binary number");
        String binary2 = scanner.next();

        //convert binary into number
        int number1 = Integer.parseInt(binary1, 2);
        int number2 = Integer.parseInt(binary2, 2);

        int sum = number1 + number2;
        //convert back to Binary
        String binarysum = Integer.toBinaryString(sum);

        System.out.println("Binary sum : " + binarysum);
        scanner.close();
    }

    public static void exe18() {

        /*18. Binary Multiplication

     Write a Java program to multiply two binary numbers.
Input Data:
Input the first binary number: 10
Input the second binary number: 11
Expected Output
Product of two binary numbers: 110
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Binary Number");
        String binary1 = scanner.next();

        System.out.println("Enter Binary Number 2");
        String binary2 = scanner.next();

        //convert into int
        int num1 = Integer.parseInt(binary1, 2);
        int num2 = Integer.parseInt(binary2, 2);
        int mult = num1 * num2;

        //convert back into binary

        String binaryMult = Integer.toBinaryString(mult);
        System.out.println("Binary Multiplication :" + binaryMult);
    }
}
