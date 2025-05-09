package com.agnes.Binary;

import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {

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
    }

}
