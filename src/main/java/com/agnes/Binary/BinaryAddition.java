package com.agnes.Binary;

import java.awt.*;
import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        exe30();
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

        scanner.close();
    }

    public static void exe19() {
        /*Write a Java program to convert an integer number to a binary number.
Input Data:
Input a Decimal Number : 5
Expected Output

Binary number is: 101

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer number");
        int number = scanner.nextInt();

        //convert number into Binary number
        String binaryNumber = Integer.toBinaryString(number);
        System.out.println(" Convert Binary " + binaryNumber);

        scanner.close();
    }

    public static void exe20() {
        /*Write a Java program to convert a decimal number to a hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output

Hexadecimal number is : F

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Decimal number");
        int number = scanner.nextInt();

        //convert number into hexadecimal number
        String hex = Integer.toHexString(number);
        System.out.println(hex);

        scanner.close();

    }

    public static void exe21() {
        /*Write a Java program to convert a decimal number to an octal number.
Input Data:
Input a Decimal Number: 15
Expected Output

Octal number is: 17

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int decimal = scanner.nextInt();

        //convert number to octal
        String octal = Integer.toOctalString(decimal);
        System.out.println("Converted number :" + octal);

        scanner.close();
    }
    public static  void exe22() {
        /*Write a Java program to convert a binary number to a decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter a binary Number");
        String binary = scanner.next();

        //convert number into a decimal
        int decimal = Integer.parseInt(binary,2);
        System.out.println("Converted number " + decimal);

        scanner.close();
    }
    public static void exe23() {
        /*Write a Java program to convert a binary number to a hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output

HexaDecimal value: D

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary Number");
        String binary = scanner.next();

        // convert to integer
        int number = Integer.parseInt(binary, 2);

        //convert to hexadecimal
        String hex = Integer.toHexString(number);
        System.out.println("Hexadecimal Value :" + hex.toUpperCase());

        scanner.close();
    }
    public  static  void exe24() {
        /*Write a Java program to convert a binary number to an octal number.
Input Data:
Input a Binary Number: 111
Expected Output

Octal number: 7

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Binary Number");
        String binary = scanner.next();

        // convert number into integer
        int number = Integer.parseInt(binary, 2);

        // convert integer into octal
        String octal = Integer.toOctalString(number);
        System.out.println("Octal number " + octal);

        scanner.close();
    }
    public  static void exe25() {
        /*Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output

Equivalent decimal number: 8
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an octal number");
        String octal = scanner.next();

        // convert octal into decimal number
        int decimal = Integer.parseInt(octal, 8);
        System.out.println(decimal);

        scanner.close();
    }
    public static void exe26() {
        /*Write a Java program to convert a octal number to a binary number.
Input Data:
Input any octal number: 7
Expected Output

Equivalent binary number: 111
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  an octal number");
        String octal = scanner.next();

        //convert number to integer

        int number = Integer.parseInt(octal, 8);

        // convert integer into binary
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary Value :" + binary);

        scanner.close();

    }
    public static void exe27() {
        /*Write a Java program to convert a octal number to a hexadecimal number.
Input Data:
Input a octal number : 100
Expected Output

Equivalent hexadecimal number: 40

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an octal number");
        String octal = scanner.next();

        //convert to integer
        int number = Integer.parseInt(octal, 8);

        //convert to hexadecimal
        String hex = Integer.toHexString(number);
        System.out.println("converted value:" + hex);
         scanner.close();
    }
    public static void exe28() {
        /*Write a Java program to convert a hexadecimal value into a decimal number.
Input Data:
Input a hexadecimal number: 25
Expected Output

Equivalent decimal number is: 37
Click me to see the solution
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hexadecimal value");
        String hex = scanner.next();

        int decimal = Integer.parseInt(hex, 16);
        System.out.println(decimal);

        scanner.close();
    }
    public  static void exe29(){
        /*Write a Java program to convert a hexadecimal number into a binary number.
Input Data:
Enter Hexadecimal Number : 37
Expected Output

Equivalent Binary Number is: 110111
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hexadecimal value");
        String hex = scanner.next();

        //convert into integer
        int number = Integer.parseInt(hex, 16);

        //convert integer into binary
        String binary = Integer.toBinaryString(number);
        System.out.println("Binary Value " + binary);

        scanner.close();
    }
    public  static void exe30() {
        /*Write a Java program to convert a hexadecimal value into an octal number.
Input Data:
Input a hexadecimal number: 40
Expected Output

Equivalent of octal number is: 100
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a hexadecimal value");
        String hex = scanner.next();

        //convert hex into integer
        int number = Integer.parseInt(hex, 16);

        //convert integer into octal
        String octal = Integer.toOctalString(number);
        System.out.println("Octal value " + octal);

        scanner.close();
    }
}
