package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    // A program that reads the given number in feet and converts it into meters ...
        Scanner scan=new Scanner(System.in);
        final double METERS_PER_FOOT = 0.3048;
        System.out.println("Enter the number of feet: ");
        int numberOfFeet = scan.nextInt();
        double result= METERS_PER_FOOT*numberOfFeet;
        System.out.println(numberOfFeet + " feet is " + result + " meters.");
    }
}
