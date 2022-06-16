package com.rollingstone.sum;

import java.io.InputStreamReader;
import java.util.Scanner;

public class SumOfTwoNumbers
{
    public static void main(String[] args) {

        // This is a comment in Java. Anything that starts with two front slashes are ignored by the Java Compiler
        /*
            Here is a multiline comment in Java, C and C++ and JavaScript
            Anything between the /* and star slash are ignored by the java compiler
         */

        // Here is how we add two integers in java

        Scanner scanner = new Scanner(new InputStreamReader(System.in));

        System.out.println("The Sum of Two Integers is :" +( 3+5));

        // Here is how we extend the functionality and actually take user input from the keyboard and then add them

        System.out.println("Reading two int from console in Java for adding them: ");
        System.out.println("Please Enter the first int: ");
        int number1 = scanner.nextInt();
        System.out.println("Integer input: " + number1);

        System.out.println("Please Enter the first int: ");
        int number2 = scanner.nextInt();
        System.out.println("Integer input: " + number2);

        System.out.println("The Sum of Two user input Integers is :" +( number1 + number2));
    }
}
