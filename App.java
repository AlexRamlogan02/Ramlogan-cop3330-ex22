package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Alexandra Ramlogan
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        System.out.print("Enter the first number : ");
        a = scan.nextInt();
        System.out.print("Enter the second number : ");
        b = scan.nextInt();
        System.out.print("Enter the third number : ");
        c = scan.nextInt();
        if ( a < b) {
            if (b < c)
                System.out.println(c + "Is the largest number");
            else if (b > c)
                System.out.println(b + "Is the largest number");
        }
        else if (a>c)
        {
            System.out.println(a +"Is the largest number");
        }
    }
}
