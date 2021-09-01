package org.example;
import java.util.Scanner;
/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 daniela gomez-dugan
 */
public class hello
{
    public static void main(String[] args )
    {
        Scanner input = new Scanner(System.in);
        System.out.println( "What is your name?");
        String name = input.nextLine();
        System.out.println("Hello, " + name + ", nice to meet you!");
    }
}
