package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 Daniela Gomez-Dugan
 */
public class App 
{
    public static void main( String[] args )
    {
        // Asks user for their name and output a message
        Scanner input = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = input.nextLine();

        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
