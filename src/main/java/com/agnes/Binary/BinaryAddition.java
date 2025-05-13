package com.agnes.Binary;

import java.awt.*;
import java.time.DayOfWeek;
import java.util.Scanner;

import static java.lang.Math.tan;

public class BinaryAddition {
    public static void main(String[] args) {
        exe37();
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

    public static void exe22() {
        /*Write a Java program to convert a binary number to a decimal number.
Input Data:
Input a binary number: 100
Expected Output

Decimal Number: 4

         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary Number");
        String binary = scanner.next();

        //convert number into a decimal
        int decimal = Integer.parseInt(binary, 2);
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

    public static void exe24() {
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

    public static void exe25() {
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

    public static void exe29() {
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

    public static void exe30() {
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

    public static void exe31() {
        /*Write a Java program to check whether Java is installed on your  computer.
Expected Output

Java Version: 1.8.0_71
Java Runtime Version: 1.8.0_71-b15
Java Home: /opt/jdk/jdk1.8.0_71/jre
Java Vendor: Oracle Corporation
Java Vendor URL: http://Java.oracle.com/
Java Class Path:
         */
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
        System.out.println("Java Home: " + System.getProperty("java.home"));
        System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
        System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
        System.out.println("Java Class Path: " + System.getProperty("java.class.path"));
    }

    public static void exe32() {
        /*Write a Java program to compare two numbers.
Input Data:
Input first integer: 25
Input second integer: 39
Expected Output

25 != 39
25 < 39
25 <= 39
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = scanner.nextInt();

        System.out.println("Enter number 2 ");
        int number2 = scanner.nextInt();

        if (number1 != number2) {
            System.out.println(number1 + " != " + number2);
        }
        if (number1 < number2) {
            System.out.println(number1 + " < " + number2);

        }
        if (number1 <= number2) {
            System.out.println(number1 + " <= " + number2);
        }
        scanner.close();
    }

    public static void exe33() {
        /*Write a Java program and compute the sum of an integer's digits.
Input Data:
Input an integer: 25
Expected Output

The sum of the digits is: 7
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a digit");
        int number = scanner.nextInt();
        int sum = 0;
        while (number != 0) {
            sum += number % 10; // get the last digit
            number /= 10;       // remove the last digit
        }

        System.out.println("The sum of the digits is: " + sum);

        scanner.close();
    }

    public static void exe34() {
        /*Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side
Input Data:
Input the length of a side of the hexagon: 6
Expected Output

The area of the hexagon is: 93.53074360871938
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the length of a side of the hexagon");
        double hexLength = scanner.nextDouble();

        double hexArea = (6 * Math.pow(hexLength, 2)) / (4 * Math.tan(Math.PI / 6));

        System.out.println(hexArea);

        scanner.close();

    }

    public static void exe35() {
        /*Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side
Input Data:
Input the number of sides on the polygon: 7
Input the length of one of the sides: 6
Expected Output

The area is: 130.82084798405722
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n sides of a polygon");
        double nSides = scanner.nextDouble();

        System.out.println("Enter the length of a polygon");
        double length = scanner.nextDouble();

        double area = (nSides * Math.pow(length, 2)) / (4 * Math.tan(Math.PI / nSides));
        System.out.println("Polygon area :" + area);

        scanner.close();
    }

    public static void exe36() {
        /*Write a Java program to compute the distance between two points on the earth's surface.
Distance between the two points [ (x1,y1) & (x2,y2)]
d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
Radius of the earth r = 6371.01 Kilometers
Input Data:
Input the latitude of coordinate 1: 25
Input the longitude of coordinate 1: 35
Input the latitude of coordinate 2: 35.5
Input the longitude of coordinate 2: 25.5
Expected Output

The distance between those points is: 1480.0848451069087 km
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the latitude of coordinate");
        double latitude = Math.toRadians(scanner.nextDouble());

        System.out.println("Enter the longitude of coordinate");
        double longitude = Math.toRadians(scanner.nextDouble());

        System.out.println("Enter the latitude 2 of coordinate");
        double latitude2 = Math.toRadians(scanner.nextDouble());

        System.out.println("Enter the longitude 2 of coordinate");
        double longitude2 = Math.toRadians(scanner.nextDouble());

        double radius = 6371.01;
        double distance = radius * Math.acos(Math.sin(latitude) * Math.sin(latitude2) + Math.cos(latitude) * Math.cos(latitude2) * Math.cos(longitude - longitude2));

        System.out.println("Distance between the points are " + distance);

        scanner.close();
    }

    public static void exe37() {
        /*Write a Java program to reverse a string.
Input Data:
Input a string: The quick brown fox
Expected Output

Reverse string: xof nworb kciuq ehT
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a sentence ");
        String original = scanner.nextLine();

        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println(reversed);
    }

}
